package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Коллекции Java array list
        ArrayList<Integer> nubmers = new ArrayList<>();
        nubmers.add(5);
        nubmers.add(50);
        nubmers.add(1, 30);//Подставляем значение в 11 строчке,меняем очереденость
        //System.out.println(nubmers.size());
//        nubmers.get(1);//Выводим значение из массива по индексу 1
//        nubmers.remove(1)//Удаляет значение из массива по индексу 1
//        nubmers.clear();//Удаляет все значения
        for (Integer element : nubmers) {
            System.out.println(element);
        }
    }
}
