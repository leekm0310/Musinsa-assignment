package com.musinsa.musinsaassignment.repository;

import com.musinsa.musinsaassignment.dto.ItemByPriceAndCategoryResponse;
import com.musinsa.musinsaassignment.dto.TotalPriceByBrandResponse;

import java.util.List;

public interface CustomItemRepository {

    List<ItemByPriceAndCategoryResponse> getMinPriceListByCategory();
    List<TotalPriceByBrandResponse> getMinTotalPriceAndBrand();

}
