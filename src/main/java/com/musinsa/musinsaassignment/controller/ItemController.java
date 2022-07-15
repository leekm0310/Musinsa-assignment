package com.musinsa.musinsaassignment.controller;

import com.musinsa.musinsaassignment.dto.ItemByPriceAndCategoryResponse;
import com.musinsa.musinsaassignment.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/getMinPriceListByCategory")
    public List<ItemByPriceAndCategoryResponse> getMinPriceListByCategory(){
        return itemService.getMinPriceListByCategory();
    }
}