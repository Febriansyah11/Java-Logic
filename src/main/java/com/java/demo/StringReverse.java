package com.java.demo;

public class StringReverse {

    static String manualReverse(String text) {
        String reverse = "";
        char[] chars = text.toCharArray();
        for (int i = chars.length-1; i >= 0 ; i--) {
                reverse += chars[i];
        }
        return reverse;
    }

    static String libraryReverse(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String text = "Kasur Rusak";
        System.out.println(manualReverse(text)+ " Manual Reverse");
        System.out.println(libraryReverse(text)+ " Library Reverse");
    }
}
