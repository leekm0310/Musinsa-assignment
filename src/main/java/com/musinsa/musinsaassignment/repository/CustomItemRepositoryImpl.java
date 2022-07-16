package com.musinsa.musinsaassignment.repository;

import com.musinsa.musinsaassignment.dto.ItemByPriceAndCategoryResponse;
import com.musinsa.musinsaassignment.dto.TotalPriceByBrandResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.musinsa.musinsaassignment.domain.QItem.item;

@RequiredArgsConstructor
public class CustomItemRepositoryImpl implements CustomItemRepository {

    private final JPAQueryFactory jpaQueryFactory;

    //TODO: 브랜드명도 함께 반환하게 해야함
    @Override
    public List<ItemByPriceAndCategoryResponse> getMinPriceListByCategory() {
        List<ItemByPriceAndCategoryResponse> result = jpaQueryFactory
                .select(Projections.constructor(ItemByPriceAndCategoryResponse.class,
                        item.category.name, item.price.min()))
                .from(item)
                .groupBy(item.category.id)
                .fetch();
        return result;
    }

    @Override
    public List<TotalPriceByBrandResponse> getMinTotalPriceAndBrand() {
        return jpaQueryFactory
                .select(Projections.constructor(TotalPriceByBrandResponse.class, item.brand.name, item.price.sum()))
                .from(item)
                .groupBy(item.brand.id)
                .orderBy(item.price.sum().asc())
                .limit(1)
                .fetch();
    }

}
