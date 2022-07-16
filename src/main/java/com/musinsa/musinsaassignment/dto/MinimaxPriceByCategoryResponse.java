package com.musinsa.musinsaassignment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MinimaxPriceByCategoryResponse {

    private ItemResponse min;
    private ItemResponse max;

}
