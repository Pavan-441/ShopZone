package com.example.ShopZone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShopZone.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
