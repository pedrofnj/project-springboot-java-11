package com.project.spring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
