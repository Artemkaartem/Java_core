package ru.gb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static List<Customer> customers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();

    public static Order getProduct (Customer customer, Product product, int quantity) {
        try {
            if (!customers.contains(customer)) {
                throw new CustomerException();
            }
            if (!products.contains(product)) {
                throw new ProductException();
            }
            if ((quantity <= 0) || (quantity > products.size())){
                throw new AmountException();
            }
            return new Order(customer, product, quantity);
        } catch (CustomerException e) {
            e.printStackTrace();
        } catch (ProductException e) {
            System.err.println("Товара не существует");
        } catch (AmountException e) {
            System.out.println("Количество задано некорректно");
        }
        return null;
    }

    public static String data(List<Customer> customers){

        System.out.println("Введите сегодняшнюю дату (MM/dd/yyyy): ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String date2=null;
        try {
            date2 = String.valueOf(dateFormat.parse(a));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (date2.contains("Dec 31")){
            System.out.println("С новым годом! ");
            customers.stream().forEach(c -> System.out.println(c.getFio()));
        }
       else if (date2.contains("Mar 08")){
            System.out.println("С 8 марта");

            customers.stream()
                    .filter(value -> value.getGender().contains("женский"))
                    .forEach(c -> System.out.println(c.getFio()));
        }
       else if (date2.contains("Feb 23")){
            System.out.println("С 23 февраля");

            customers.stream()
                    .filter(value -> value.getGender().contains("мужской"))
                    .forEach(c -> System.out.println(c.getFio()));
           }
        else System.out.println("Нет праздника");

        return date2;
    }
}
