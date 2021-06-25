package ru.geekbrains.spring.mvc.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Product {
    private int id;
    private String title;
    private double cost;
}
