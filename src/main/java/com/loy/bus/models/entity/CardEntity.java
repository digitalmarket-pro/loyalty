package com.loy.bus.models.entity;


import com.loy.bus.enums.CardStatus;
import com.loy.bus.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbSmartCards")
public class CardEntity implements Serializable {
    @Id
    String cardNumber;
    String requestNumber;
    @Temporal(TemporalType.TIMESTAMP)
    Date requestDate;
    String requestedBy;
    boolean requested;
    @Temporal(TemporalType.TIMESTAMP)
    Date deliveryDate;
    String deliveredBy;
    boolean delivered;
    @Temporal(TemporalType.TIMESTAMP)
    Date verificationDate;
    String verifiedBy;
    boolean verified;
    @Enumerated(EnumType.STRING)
    @Column(length=15)
    CardStatus status ;

    String ownernames; //name and surname

    @Enumerated(EnumType.STRING)
    @Column(length=15)
    DocumentType documentType;
    @Column(length=20)
    String documentNumber;

    @ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="customerCode",insertable = false,updatable = false,nullable = true)
    CustomerEntity customer;




}
