package com.loy.bus.models.entity;


import com.loy.bus.enums.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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



}
