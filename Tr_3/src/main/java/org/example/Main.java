package org.example;

public class Main {
    public static void main(String[] args) {
        //Условные конструкции if-else
        int a=15,b=15;
        //char sym1 ='A',sym2 ='a';
        //if(sym1==sym2)
        boolean isHasCar=false;
        if (isHasCar && a==b){//эквивалентно ishascar==true;
            //if (!isHasCar)//эквивалентно ishascar==false;

            System.out.println("Да,верно");
        } else if (a>=b) {
            System.out.println("Second test");
        } else {
            System.out.println("Нет не верно");
        }
    }
}