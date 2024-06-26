package org.example;

import java.util.LinkedList;

public class Main_2 {
    public static void main(String[] args) {
//        Коллекци в Java LinkedList
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(23.6f);
        numbers.add(4.632423f);

        for (Float element : numbers) ;
        System.out.println(numbers);
    }
}
