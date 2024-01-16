package ru.gb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String fio;
    private int age;
    private String phone;
    private String gender;

    @Override
    public String toString() {
        return "Customer: " +
                "fio = " + fio +
                ", age = " + age +
                ", phone = " + phone +
                ", gender = " + gender +
                 "\n";
    }
}