package com.loy.bus.repository;

import com.loy.bus.models.entity.CustomerProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerProfileEntityRepository extends JpaRepository<CustomerProfileEntity,String> {
}
