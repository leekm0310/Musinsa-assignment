package com.musinsa.musinsaassignment.service;

import com.musinsa.musinsaassignment.domain.Item;
import com.musinsa.musinsaassignment.dto.*;
import com.musinsa.musinsaassignment.repository.CategoryRepository;
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
    private final CategoryRepository categoryRepository;

    public List<ItemByPriceAndCategoryResponse> getMinPriceListByCategory(){
        return itemRepository.getMinPriceListByCategory();
    }

    public TotalPriceByBrandResponse getMinTotalPriceAndBrand(){
        return itemRepository.getMinTotalPriceAndBrand().get(0);
    }

    public MinimaxPriceByCategoryResponse getMinimaxPriceByCategory(String category){
        if (!categoryRepository.existsByName(category)){
            throw new IllegalArgumentException("카테고리명을 확인해주세요");
        }

        List<Item> itemList = itemRepository.findByCategory_NameOrderByPrice(category);
        int lastIndex = itemList.size()-1;

        ItemResponse minItem = new ItemResponse(itemList.get(0));
        ItemResponse maxItem = new ItemResponse(itemList.get(lastIndex));

        return new MinimaxPriceByCategoryResponse(minItem, maxItem);
    }
}
