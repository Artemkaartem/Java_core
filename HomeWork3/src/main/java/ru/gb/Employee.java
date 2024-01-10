package ru.gb;

import java.time.LocalDate;

public class Employee {

     private String name;
     private String position;
     private String phone;
     private double salary;
     private int age;

    protected LocalDate birthday;

    public Employee(String name, String position, String phone, double salary, int age, LocalDate birthday ) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", birthday=" + birthday +
                '}');
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public String infoFormat(){
        return String.format("Employee {name = '%s'," +
                        ", position = '%s'" +
                        ", phone = '%s'" +
                        ", salary = %f" +
                        ", age = %d " +
                        ", birthday= }\n"
                , name
                , position
                , phone
                , salary
                , age
                , birthday);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
