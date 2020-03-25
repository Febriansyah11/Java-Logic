package com.java.demo;

import java.util.Scanner;

public class FactorialNumber {

    public static Integer factorialNumber(int number) {
        int totall = number ==  0 ? 1 : number;
        for (int i = number-1; i > 0; i--) {
            totall *= i;
        }
        return totall;
    }
    public static void main(String[ ] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(factorialNumber(scn.nextInt()));
    }
}
