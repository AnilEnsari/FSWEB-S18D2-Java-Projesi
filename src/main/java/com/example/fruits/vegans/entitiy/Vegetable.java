package com.example.fruits.vegans.entitiy;

import com.example.fruits.vegans.entitiy.enums.FruitType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "vegetable",schema = "fsweb")
public class Vegetable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotBlank
    @NotNull
    private String name ;
    @Column(name = "price")
    @Positive
    @NotNull
    private  double price;
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
