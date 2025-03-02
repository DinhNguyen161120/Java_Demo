package com.ndd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "java_order_001")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // create one table in DB
    private Long id;
}
