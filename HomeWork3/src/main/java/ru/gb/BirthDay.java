package ru.gb;

import java.util.Comparator;

public class BirthDay implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
