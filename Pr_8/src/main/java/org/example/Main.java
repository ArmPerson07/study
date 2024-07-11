package org.example;


public class Main {
    public static void main(String[] args) {
        // ООП: классы и обьекты
        //Наследование в Java

        Car bmw = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});

        Truck truck = new Truck(5600,new byte[]{0, 0, 0});
        System.out.println(bmw);
        System.out.println(truck);

    }
}
