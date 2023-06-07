package com.loy.bus.repository;

import com.loy.bus.models.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity,String>
{
}
