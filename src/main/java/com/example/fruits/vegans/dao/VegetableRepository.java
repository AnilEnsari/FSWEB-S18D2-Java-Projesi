package com.example.fruits.vegans.dao;

import com.example.fruits.vegans.entitiy.Fruit;
import com.example.fruits.vegans.entitiy.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Integer> {

    @Query(value = "SELECT v.name, v.id, v.price, v.is_grown_on_tree FROM fsweb.vegetable as v ORDER BY v.price desc ", nativeQuery = true)
     List<Vegetable> orderByPriceDesc();

    @Query(value = "SELECT v.name, v.id, v.price, v.is_grown_on_tree FROM fsweb.vegetable as v ORDER BY v.price asc ",nativeQuery = true)
     List<Vegetable> orderByPriceAsc();

    @Query(value ="SELECT v.id, v.name, v.price, v.is_grown_on_tree FROM fsweb.vegetable as v WHERE v.name ilike %:name%" ,nativeQuery = true)
    List<Vegetable> includesName(String name);



}
