package org.example;

import java.util.Scanner;

public class main_3 {
    public static void main(String[]args){
        //Условные конструкции switch-case
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите 1 цифру");
        int a =scanner.nextInt();

        System.out.print("Введите 2 цифру");
        int b =scanner.nextInt();

        int res;

        System.out.print("Выберите действие");
        String chose= scanner.nextLine();
        chose=scanner.nextLine();

        switch (chose){
            case"+":
                res =a+b;
                System.out.println(res);
                break;
            case"-":
                res =a-b;
                System.out.println(res);
                break;
            case"*":
                res =a*b;
                System.out.println(res);
                break;
            case"/":
                if (b==0)

                    System.out.println("error");
                else{
                    res = a / b;
                    System.out.println(res);

                }
                break;
            default:
                System.out.println("Вы ввели что то не так");



        }



    }
}
