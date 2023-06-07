package com.loy.bus.models.entity;



import com.loy.bus.enums.Gender;
import com.loy.bus.enums.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="lbtCustomers")

public class CustomerEntity implements Serializable {
    @Id
    @Column(length=15)
    String customerCode;
    String name;
    String surname;
    String nationalId;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Enumerated(EnumType.STRING)
    MaritalStatus maritalStatus;
    String emailAddress;
    String msdisdn;
    @Column(columnDefinition = "text")
    String fullAddres;

    @Column(columnDefinition = "mediumtext")
    String comments;

    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "customerCode",insertable = false,updatable = false)
    CustomerProfileEntity profile;

  @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="cardNumber",insertable = false,updatable = false,nullable = true)
   Set<CardEntity> cards;

}
