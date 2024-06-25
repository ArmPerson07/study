package org.example;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Циклы
       /* for (float i = 100; i >10; i/=2)
        {
            System.out.println("element:\t" + i);
        }
*/
       /* int i=100;
        while (i>10){
            System.out.println("element\t"+i);
            i-=25;

        }
        int i =0;
        do {
            System.out.println("element\t"+i);
            i += 1;
        }while (i<10);
    */
        for (int i=5;i<25;i +=2){
            if (i%3==0)
                continue;

            if (i>=17)


                System.out.println("Element"+i);
        }
    }
}