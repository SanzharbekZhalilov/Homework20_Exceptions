package com.company;

public class Main {
    public static void main(String[] args) {

        try(Car car = new Car()) {
            Car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}