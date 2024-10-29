package com.silu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silu.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
