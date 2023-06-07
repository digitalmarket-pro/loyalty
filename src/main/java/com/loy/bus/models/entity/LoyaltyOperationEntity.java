package com.loy.bus.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="ltbLoyaltyOperations")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoyaltyOperationEntity implements Serializable {
    @Id
    String operationId;
    @Temporal(TemporalType.DATE)
   Date accountingDate;
    @Temporal(TemporalType.DATE)
    Date  operationDate;
    String contractCode;
    String contractDetailCode;
    String totalPrice;
    double commissionAmount;
    boolean customerpaid;
    @Temporal(TemporalType.DATE)
     Date customerpaidDate;
    boolean commissionpaid;
    @Temporal(TemporalType.DATE)
    Date commissionpaidDate;

}
