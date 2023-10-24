package com.example.fruits.vegans.services;


import com.example.fruits.vegans.dao.FruitRepository;
import com.example.fruits.vegans.entitiy.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {
    private FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit findById(int id) {
        Optional<Fruit> fruit = fruitRepository.findById(id);
        if (fruit.isPresent()){

            return fruit.get();
        }
        return null;
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit remove(int id) {
        Fruit fruit = findById(id);
        fruitRepository.delete(fruit);
        return fruit;
    }

    @Override
    public List<Fruit> orderByPriceDesc() {
        return fruitRepository.orderByPriceDesc();
    }

    @Override
    public List<Fruit> orderByPriceAsc() {
        return fruitRepository.orderByPriceAsc();
    }

    @Override
    public List<Fruit> includesName(String name) {
        return fruitRepository.includesName(name);
    }
}
