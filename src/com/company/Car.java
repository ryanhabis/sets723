package com.company;

import java.util.Objects;

public class Car implements Comparable<Car>
{
    //7.	Create a class car with attributes RegNo, make, price.
    //
    //a.	Add constructors, accessor, mutator and toString methods to the class.
    private String regNuimber;
    private String make;
    private double price;

    public Car(String regNuimber, String make, double price)
    {
        this.regNuimber = regNuimber;
        this.make = make;
        this.price = price;
    }

    public Car()
    {

    }

    public String getRegNuimber()
    {
        return regNuimber;
    }

    public void setRegNuimber(String regNuimber)
    {
        this.regNuimber = regNuimber;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "regNuimber='" + regNuimber + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                '}';
    }

    //d.	In your  not contain duplicates – why have both cars been added to the garage???
    //h.	Override the equals method in the Car class, two cars are equal if they have the same regNo.
    //i.	Override the hashcode method in the Car class – why should the hashcode method be overridden when the equals method is?

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getPrice(), getPrice()) == 0 && getRegNuimber().equals(car.getRegNuimber()) && getMake().equals(car.getMake());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getRegNuimber(), getMake(), getPrice());
    }

    @Override
    public int compareTo(Car o)
    {
        return 0;
    }


    //l.	Can you explain why certain cars were not added to the set?
    /*
    any cars that have the same registration number, make, and price as an existing car in the set
    would not be added, as they would be considered duplicates.
     */
}
