package org.example;


import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите роль");
        String role =scanner.nextLine();
        System.out.println("Введите пароль");
        String pass =scanner.nextLine();
        if (role.equals("Admin")&& pass.equals("123")){
            System.out.println("Все пользователи");
        }else {
            System.out.println("Привет как тебя зовут");
            String name =scanner.nextLine();
        }
    }

}
