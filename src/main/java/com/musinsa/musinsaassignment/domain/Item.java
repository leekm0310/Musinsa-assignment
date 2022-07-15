package com.musinsa.musinsaassignment.domain;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Category category;
}
