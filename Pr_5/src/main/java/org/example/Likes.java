package org.example;


public class Likes {
    public static String displayLikes(String[] names) {
        int count = names.length;
        if (count == 0) {
            return "no one likes this";
        } else if (count == 1) {
            return names[0] + " likes this";
        } else if (count == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (count == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (count - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        String[] names1 = {};
        String[] names2 = {"Peter"};
        String[] names3 = {"Jacob", "Alex"};
        String[] names4 = {"Max", "John", "Mark"};
        String[] names5 = {"Alex", "Jacob", "Mark", "Max"};

        System.out.println(displayLikes(names1));
        System.out.println(displayLikes(names2));
        System.out.println(displayLikes(names3));
        System.out.println(displayLikes(names4));
        System.out.println(displayLikes(names5));
    }
}
