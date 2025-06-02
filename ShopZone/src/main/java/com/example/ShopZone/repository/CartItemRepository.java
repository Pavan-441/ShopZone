package com.example.ShopZone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShopZone.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}
