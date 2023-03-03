package com.company;

public class ex7
{
    public static void main(String[] args)
    {
        garage g1 = new garage();

        g1.addCar(new Car("123LH12345","Corrola", 29000));
        g1.addCar(new Car("123LH12345","Corrola", 29000));
        //j.	Add the following cars to the garage – 181LH12345, Corolla, 29000
        g1.addCar(new Car("181LH12345","Corolla", 29000));
        // 181LH12345, Corolla, 29000
        g1.addCar(new Car("181LH12345","Corolla", 29000));
        // 141LH123, Ford, 29000
        g1.addCar(new Car("141LH123","Ford", 29000));

        // 141LH123, Corolla, 29000.
        g1.addCar(new Car("181LH12345","Corolla", 29000));
        // 141LH123, Ford, 29000.
        g1.addCar(new Car("141LH123","Ford", 29000));
        //141LH123, Corolla, 29000
        g1.addCar(new Car("141LH123","Corolla", 29000));
        //k.	Display all the cars in the garage.

        g1.display();
    }
}
