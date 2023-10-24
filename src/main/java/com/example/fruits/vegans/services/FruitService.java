package com.example.fruits.vegans.services;

import com.example.fruits.vegans.entitiy.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface FruitService {
    Fruit findById(int id);
    List<Fruit> findAll ();
    Fruit save (Fruit fruit);
    Fruit remove(int id);
    List <Fruit> orderByPriceDesc();
    List<Fruit> orderByPriceAsc();
    List<Fruit> includesName(String name);
}
