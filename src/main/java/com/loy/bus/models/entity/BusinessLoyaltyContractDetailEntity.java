package com.loy.bus.models.entity;

import com.loy.bus.enums.CommissionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ltb_ContractsDetails")

public class BusinessLoyaltyContractDetailEntity implements Serializable {
   @EmbeddedId
   BusinessLoyaltyContractDetailId detailId;
   String detailName;

    @Enumerated(EnumType.STRING)
    @Column(length=15)
    CommissionType commissionType;
   double commissionAmount;
}
