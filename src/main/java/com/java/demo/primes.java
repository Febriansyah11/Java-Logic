package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primes {

    static List<Integer> cekNumber(int number) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrime((i))) primes.add(i);
        }
        return primes;
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(cekNumber(scn.nextInt()));
    }
}
