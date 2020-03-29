package com.myproduct.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproduct.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
}