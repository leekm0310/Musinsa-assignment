package com.musinsa.musinsaassignment.repository;

import com.musinsa.musinsaassignment.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>, CustomItemRepository{

    List<Item> findByCategory_NameOrderByPrice(String category);
}
