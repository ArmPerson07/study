package org.example;

public class Car extends Transport {
    public Car(float bspeed, int bweight, String bcolor, byte[] bcoordinate) {
      super(bspeed,  bweight,  bcolor,  bcoordinate);

    }
    @Override
    public String toString(){
        String info = "Object speed: " + speed + "Weight: " + weight + "Color: " + color + "\n";
        String infoCoordinate = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinate += coordinate[i] + "\n";


        return info + infoCoordinate;

    }
    @Override
    public void setValues(float bspeed, int bweight, String bcolor, byte[] bcoordinate) {
        speed = 100;
        weight = bweight;
        color = bcolor;
        coordinate = bcoordinate;
    }
}
