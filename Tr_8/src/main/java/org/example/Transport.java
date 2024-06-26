package org.example;

public class Transport {
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public void setValues(float bspeed, int bweight, String bcolor, byte[] bcoordinate) {
        speed = bspeed;
        weight = bweight;
        color = bcolor;
        coordinate = bcoordinate;


    }

    public String getValues() {
        String info = "Object speed: " + speed + "Weight: " + weight + "Color: " + color + "\n";
        String infoCoordinate = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinate += coordinate[i] + "\n";


        return info + infoCoordinate;
    }

}
