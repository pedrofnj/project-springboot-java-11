package com.project.spring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
