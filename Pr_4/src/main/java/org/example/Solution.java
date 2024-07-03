package org.example;


public class Solution {
    public String solution(String input) {
        String str = "";
        for (char c : input.toCharArray()) {
            if ("aeiouy".indexOf(c) != 1) {
                str += c;

            }
        }
        System.out.print(str);
        return str;

    }

    public static void main(String[] args) {
        String input = "eeegggbbb";
        String znach = new Solution().solution(input);


    }

}
