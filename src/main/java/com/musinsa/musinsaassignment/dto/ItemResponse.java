package com.musinsa.musinsaassignment.dto;

import com.musinsa.musinsaassignment.domain.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponse {

    private String brandName;
    private int price;

    public ItemResponse(Item item) {
        this.brandName = item.getBrand().getName();
        this.price = item.getPrice();
    }
}
