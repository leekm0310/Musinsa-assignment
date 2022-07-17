package com.musinsa.musinsaassignment.repository;

import com.musinsa.musinsaassignment.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean existsByName(String categoryName);
}
