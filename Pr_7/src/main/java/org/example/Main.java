package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        int squareFirst = firstDigit * firstDigit;
        int squareSecond = secondDigit * secondDigit;

        System.out.println("Первая цифра: " + firstDigit + ", квадрат: " + squareFirst);
        System.out.println("Вторая цифра: " + secondDigit + ", квадрат: " + squareSecond);

        scanner.close();
    }
}