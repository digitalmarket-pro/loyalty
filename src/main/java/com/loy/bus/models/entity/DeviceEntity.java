package com.loy.bus.models.entity;

import com.loy.bus.enums.CustStatus;
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
@Table(name="ltbDevices")
public class DeviceEntity implements Serializable {
    @Id
    @Column(length=20)
    String deviceImei;
    String deviceType;
 @Column(columnDefinition = "text")
    String description;
 @Column(length=15)
  String businessCode;

 String cardOwner; // name and surname
 String ownerdocument;

   @Enumerated(EnumType.STRING)
    CustStatus status;


}
