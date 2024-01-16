package ru.gb;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Customer ivan = new Customer("Иван", 23, "1523", "мужской");
        Shop.customers.add(ivan);
        Customer sergey = new Customer("Сергей", 45, "4878", "мужской");
        Shop.customers.add(sergey);
        Customer anna = new Customer("Анна", 40, "4640", "женский");
        Shop.customers.add(anna);
        Customer dmitry = new Customer("Дмитрий", 20, "1235", "мужской");


        Product toy1 = new Product("Игрушка", 3000);
        Shop.products.add(toy1);
        Product toy2 = new Product("Игрушка", 3000);
        Shop.products.add(toy2);
        Product toy3 = new Product("Игрушка", 3000);
        Shop.products.add(toy3);
        Product toy4 = new Product("Игрушка", 3000);
        Shop.products.add(toy4);
        Product toy5 = new Product("Игрушка", 3000);
        Shop.products.add(toy5);
        Product puzzle = new Product("Пазл", 6000);

        Shop.orders.add(Shop.getProduct(ivan, toy2, 3));
        Shop.orders.add(Shop.getProduct(ivan, toy3, 1));
        Shop.orders.add(Shop.getProduct(ivan, toy5, 4));
        Shop.orders.add(Shop.getProduct(anna, toy1, 4));

        /*
        Проверка исключений
        Shop.orders.add(Shop.getProduct(dmitry, puzzle, 2));
        Shop.orders.add(Shop.getProduct(ivan, puzzle, 5));
        Shop.orders.add(Shop.getProduct(sergey, toy4, 0));
        */

        System.out.println(Shop.orders);

        Shop.orders.removeIf(Objects::isNull);
        System.out.println("Итоговое кол-во заказов = " + Shop.orders.size());

        System.out.println("Покупатели: " + "\n" + Shop.customers);

        System.out.println(Shop.data(Shop.customers ));

    }

}