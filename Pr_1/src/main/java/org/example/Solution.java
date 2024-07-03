package org.example;

import java.util.Scanner;

public class Solution{

public int solution(int number){
    int sum=0;
    Scanner scan=new Scanner(System.in);

    for (int i=0;i<number;i++){
        if (i%3==0 || i%5==0){sum+=i;}
    }
    System.out.println(sum);
    return sum;
}

}