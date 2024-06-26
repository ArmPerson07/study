package org.example;


public class Main {
    public static void main(String[] args) {
//   Методы в Java
//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");

        short num = 7;
        int result1 = summa((short) 5, num);

        short num2 = 3;
        int result2 = summa((short) 4, num2);
        info(String.valueOf(result2));
    }

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Результат " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }

}