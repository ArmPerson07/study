package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);

        short num1 =50,num2 = 10;
        int res = num1 + num2;
        System.out.println("Результат \t"+res);

        res+=10;
        res = res +10;
        res ++; //Инкремент +1

    }
}
