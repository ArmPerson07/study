package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Массивы данных
        int[] numbers = new int[5];
        numbers[0] = 11;
        numbers[1] = 12;
        numbers[2] = 13;
        numbers[3] = 14;
        numbers[4] = 15;
        int res = numbers[2] + numbers[3];
        // System.out.println(numbers[0]);

        float[] numbers2 = new float[]{5.0f, 6.45f, 34.3423f};
        // System.out.println(numbers2[1]);

        for (int i = 0; i < numbers2.length; i++) {

            System.out.println("element" + numbers2[i]);

        }
    }
}