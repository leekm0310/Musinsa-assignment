package com.musinsa.musinsaassignment.repository;

import com.musinsa.musinsaassignment.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>, CustomItemRepository{

}
