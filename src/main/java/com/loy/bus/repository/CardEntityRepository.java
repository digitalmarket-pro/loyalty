package com.loy.bus.repository;

import com.loy.bus.models.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardEntityRepository extends JpaRepository<CardEntity,String> {
}
