package com.example.fruits.vegans.services;



import com.example.fruits.vegans.dao.VegetableRepository;
import com.example.fruits.vegans.entitiy.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableImpl implements VegetableService {

VegetableRepository vegetableRepository;
@Autowired
    public VegetableImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable findById(int id) {
   Optional<Vegetable>  vegetable = vegetableRepository.findById(id);
       if (vegetable.isPresent()){
           return vegetable.get();
       }
       return null;
    }

    @Override
    public List<Vegetable> findAll() {
       return vegetableRepository.findAll();
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
      return   vegetableRepository.save(vegetable);
    }

    @Override
    public Vegetable remove(int id) {
    Vegetable vegetable = findById(id);
    vegetableRepository.delete(vegetable);
        return vegetable;
    }

    @Override
    public List<Vegetable> orderByPriceDesc() {
        return  vegetableRepository.orderByPriceDesc();
    }

    @Override
    public List<Vegetable> orderByPriceAsc() {
        return vegetableRepository.orderByPriceAsc();
    }

    @Override
    public List<Vegetable> includesName(String name) {
        return vegetableRepository.includesName(name);
    }
}
