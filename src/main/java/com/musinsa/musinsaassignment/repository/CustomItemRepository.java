package com.musinsa.musinsaassignment.repository;

import com.musinsa.musinsaassignment.dto.ItemByPriceAndCategoryResponse;

import java.util.List;

public interface CustomItemRepository {

    List<ItemByPriceAndCategoryResponse> getMinPriceListByCategory();
}
