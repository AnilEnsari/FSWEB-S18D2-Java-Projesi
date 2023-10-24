package com.example.fruits.vegans.services;

import com.example.fruits.vegans.entitiy.Vegetable;

import java.util.List;

public interface VegetableService {
    Vegetable findById(int id);
    List <Vegetable> findAll ();
    Vegetable save (Vegetable vegetable);
    Vegetable remove(int id);
    List <Vegetable> orderByPriceDesc();
    List<Vegetable> orderByPriceAsc();
    List<Vegetable> includesName(String name);
}
