package org.example;

import java.util.Scanner;

public class Solution {
    public int solution(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("aeiouy".indexOf(c) != -1) {

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "";
        int vowelCount = new Solution().solution(input);
        System.out.println("The number of vowels in the given string is: " + vowelCount);
    }
}

