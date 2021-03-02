package com.example.demokku.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String id;
    private String name;
    private String description;

}
