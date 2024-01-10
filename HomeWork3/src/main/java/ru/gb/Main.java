package ru.gb;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee("Ivan", "developer", "111111111", 1000.0, 25, LocalDate.of(1999, 10, 2));
        Employee olga = new Employee("Olga", "tester", "2222222222", 150.0, 27, LocalDate.of(1997, 11, 24));
        Employee sergei = new Employee("Sergei", "designer", "333333333", 200.0, 30, LocalDate.of(1994, 9, 12));
        Employee natlia = new Employee("Natalia", "analitic", "44444444", 250.0, 35, LocalDate.of(1989, 6, 1));
        Employee andrey = new Employee("Andrey", "devops", "5555555555", 300.0, 47, LocalDate.of(1977, 4, 3));
        Employee Petr = new Manager("Petr", "Manager", "666666666", 1000.0, 50, LocalDate.of(1974, 7, 7));

        Employee[] employees = {ivan, olga, sergei, natlia, andrey, Petr};

        System.out.println(Arrays.toString(employees));
        increaseSalary(employees);

        System.out.println(Arrays.toString(employees));

        increaseSalary(employees, 45, 5000);
        System.out.println(Arrays.toString(employees));

        System.out.println("---------------");
        BirthDay comparator = new BirthDay();
        Arrays.sort(employees, comparator);
        System.out.println(Arrays.toString(employees));

        System.out.println("---------------");

        Manager.increaseSalary(employees, 5000);
        System.out.println(Arrays.toString(employees));
    }

    private static void increaseSalary(Employee[] employees){
        for (Employee employee: employees){
            if (employee.getAge() > 45) {
                employee.setSalary(employee.getSalary() + 5000);
            }
        }
    }

    private static void increaseSalary(Employee[] employees, int age, int amount){
        for (Employee employee: employees){
            if (employee.getAge() > age) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }

}