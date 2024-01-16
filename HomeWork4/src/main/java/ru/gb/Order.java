package ru.gb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private Customer customer;
    private Product product;

    private int quantity;


    @Override
    public String toString() {
        return "Order{" +
                "customer = " + customer +
                ", product = " + product +
                ", quantity = " + quantity +
                '}' + "\n";
    }
}

