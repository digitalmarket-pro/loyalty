package com.loy.bus.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BusinessLoyaltyContractDetailId implements Serializable {
    @Column(length=30)
    String contractCode;
    @Column(length=30)
    String contractDetailCode;

    @Override
    public int hashCode() {
        return Objects.hash(contractCode,contractDetailCode);
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null ||getClass()!=obj.getClass())
            return false;
        BusinessLoyaltyContractDetailId uaid = (BusinessLoyaltyContractDetailId) obj;
        return (contractCode==uaid.contractCode) && (contractDetailCode==uaid.contractDetailCode);

    }


}
