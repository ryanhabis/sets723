package com.company;

import java.util.HashSet;
import java.util.Set;

public class garage
{
    //b.	Create a class Garage that contains a single field stock that is a HashSet of cars. The hash set should be created in the constructor of the class.

    private Set<Car> stock;
    public garage()
    {
        stock = new HashSet<>();
    }
    //c.	Write a method add() that adds a Car to stock and display() that displays the elements of stock on the console..
    public boolean addCar(Car c)
    {
        return stock.add(c);
    }

    public void display()
    {
        System.out.println("Stock " + stock);
    }
}
