package com.example.demokku.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demokku.entity.Order;

@Repository
public interface OrderRepostiroty extends CrudRepository<Order, String> {

}
