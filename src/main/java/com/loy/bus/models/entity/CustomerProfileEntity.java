package com.loy.bus.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ltbCustomerProfile")
public class CustomerProfileEntity implements Serializable {
    @Id
    String customerCode;
    @Column(columnDefinition = "mediumtext")
    String photoProfile;




}
