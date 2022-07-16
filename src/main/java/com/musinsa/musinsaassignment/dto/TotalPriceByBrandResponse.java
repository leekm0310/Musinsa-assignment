package com.musinsa.musinsaassignment.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TotalPriceByBrandResponse {

    private String brandName;
    private int price;

}
