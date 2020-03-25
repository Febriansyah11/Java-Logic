package com.java.demo;

import java.util.Scanner;

public class Palindrom {

    static String isPalindrom(String text) {
        String output = "";
        String original = text;
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.reverse();
//        sb.toString().equals(original) ? "wewe": "wew";
        if (sb.toString().equals(original)) {
            output = "This text is Palindrom";
        } else output = "This text not a Plindrom";
        return output;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(isPalindrom(scn.nextLine()));
    }
}
