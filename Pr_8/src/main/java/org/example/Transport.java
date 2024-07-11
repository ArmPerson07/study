package org.example;

public class Transport {
    protected float speed;
    protected int weight;
    protected String color;
     byte[] coordinate;


    public Transport(float bspeed, int bweight, String bcolor, byte[] bcoordinate) {
        System.out.println("");
        setValues(bspeed, bweight, bcolor, bcoordinate);


    }

    public Transport(int bweight, byte[] bcoordinate) {
        this.weight = bweight;
        this.coordinate = bcoordinate;
        //System.out.println(this.getValues());
    }

    public void setValues(float bspeed, int bweight, String bcolor, byte[] bcoordinate) {
        speed = bspeed;
        weight = bweight;
        color = bcolor;
        coordinate = bcoordinate;


    }

    public   String getValues() {
        String info = "Object speed: " + speed + "Weight: " + weight + "Color: " + color + "\n";
        String infoCoordinate = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinate += coordinate[i] + "\n";


        return info + infoCoordinate;
    }

}
