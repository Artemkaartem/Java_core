package ru.gb;

import java.time.LocalDate;

public class Manager extends  Employee{

    public Manager(String name, String position, String phone, double salary, int age, LocalDate birthday) {
        super(name, position, phone, salary, age, birthday);
    }

    public static void increaseSalary(Employee[] employees, int amount){
        for (Employee employee: employees){
            if(!(employee instanceof Manager)){
                employee.setSalary(employee.getSalary() + amount);
            }
        }

    }
}
