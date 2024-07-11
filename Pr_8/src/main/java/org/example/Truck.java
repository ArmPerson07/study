package org.example;

public class Truck extends Transport {

    public Truck(int weight, byte[] coordinate) {
   super(weight,coordinate);
    }
    @Override
    public String toString() {
        String info = "Object speed: " + speed + "Weight: " + weight + "Color: " + color + "\n";
        String infoCoordinate = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinate += coordinate[i] + "\n";


        return info + infoCoordinate;
    }
}
