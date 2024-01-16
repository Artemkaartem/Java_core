package ru.gb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private int price;


    @Override
    public String toString() {
        return "Product{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }
}