package com.example.fruits.vegans.entitiy;

import com.example.fruits.vegans.entitiy.enums.FruitType;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;


@NoArgsConstructor
@Data
@Entity
@Table(name = "fruit", schema = "fsweb")
public class Fruit {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    @NotNull
    @NotBlank
    private String name ;

    @Column(name = "price")
    @NotNull
    @Positive
    private  double price;

    @Enumerated(EnumType.STRING)
    @NotNull

    private FruitType fruitType;

}
