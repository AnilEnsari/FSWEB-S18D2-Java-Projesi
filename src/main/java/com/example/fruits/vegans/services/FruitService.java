package com.example.fruits.vegans.services;

import com.example.fruits.vegans.entitiy.Fruit;

import java.util.List;

public interface FruitService {
    Fruit findById(int id);
    List<Fruit> findAll ();
    Fruit save (Fruit fruit);
    Fruit remove(int id);
    List <Fruit> orderByPriceDesc();
    List<Fruit> orderByPriceAsc();
    List<Fruit> includesName(String name);
}
