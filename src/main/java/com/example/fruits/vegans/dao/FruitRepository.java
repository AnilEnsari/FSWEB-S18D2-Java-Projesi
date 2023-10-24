package com.example.fruits.vegans.dao;

import com.example.fruits.vegans.entitiy.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Integer> {

    @Query(value = "SELECT f.name, f.id, f.price, f.fruit_type FROM fsweb.fruit as f ORDER BY f.price desc",nativeQuery = true)
    List<Fruit> orderByPriceDesc ();

    @Query(value = "SELECT f.name, f.id, f.price, f.fruit_type FROM fsweb.fruit as f ORDER BY f.price asc",nativeQuery = true)
    List<Fruit> orderByPriceAsc ();


    @Query(value = "SELECT f.name, f.id, f.price, f.fruit_type FROM fsweb.fruit as f WHERE f.name ilike %:name%",nativeQuery = true)
    List<Fruit> includesName(String name);
}
