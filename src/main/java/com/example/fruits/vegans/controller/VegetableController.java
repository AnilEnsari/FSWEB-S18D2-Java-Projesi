package com.example.fruits.vegans.controller;


import com.example.fruits.vegans.entitiy.Vegetable;
import com.example.fruits.vegans.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Validated
@RestController
@RequestMapping("/vegetables")
public class VegetableController {
   private VegetableService vegetableService;

   @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }
    @GetMapping("/")
    public List<Vegetable> findAll (){
        vegetableService.findAll();
        return vegetableService.orderByPriceAsc();

    }
    @GetMapping("/{id}")
    public Vegetable findById (@PathVariable int id){

      return vegetableService.findById(id);
    }
    @PostMapping("/")
    public Vegetable save (@RequestBody Vegetable vegetable){

       return vegetableService.save(vegetable);
    }
    @DeleteMapping("/{id}")
    public Vegetable delete (@PathVariable int id){

       return vegetableService.remove(id);
    }
    @GetMapping("/desc")
    public List<Vegetable> findAllDesc (){
        vegetableService.findAll();
        return vegetableService.orderByPriceDesc();

    }
    @GetMapping("/{name}")
    public List<Vegetable> findByName (@PathVariable String name){

        return vegetableService.includesName( name);
    }

}
