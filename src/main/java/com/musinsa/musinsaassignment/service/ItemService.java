package com.musinsa.musinsaassignment.service;

import com.musinsa.musinsaassignment.dto.ItemByPriceAndCategoryResponse;
import com.musinsa.musinsaassignment.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<ItemByPriceAndCategoryResponse> getMinPriceListByCategory(){
        return itemRepository.getMinPriceListByCategory();
    }

}
