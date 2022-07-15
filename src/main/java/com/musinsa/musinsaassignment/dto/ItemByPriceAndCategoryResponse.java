package com.musinsa.musinsaassignment.dto;

import com.musinsa.musinsaassignment.domain.Item;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemByPriceAndCategoryResponse {

    private String categoryName;
    private Integer price;

    @Builder
    public ItemByPriceAndCategoryResponse(Item item) {
        this.categoryName = item.getCategory().getName();
        this.price = item.getPrice();
    }

}
