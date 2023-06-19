package com.loy.bus.models.entity;

import com.loy.bus.enums.CommissionType;
import com.loy.bus.enums.CustStatus;
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
@Table(name="ltbBusinessLoyaltyContracts")

public class BusinessLoyaltyContract implements Serializable {
    @Id
    @Column(length=30)
    String contractCode;
    String businessCode;
    String productCode;
     @Temporal(TemporalType.DATE)
    Date applicationDate;
     @Temporal(TemporalType.DATE)
     Date suspensionDate;
     @Column(columnDefinition = "text")
     String comments;
     @Enumerated(EnumType.STRING)
    CustStatus status;

}
