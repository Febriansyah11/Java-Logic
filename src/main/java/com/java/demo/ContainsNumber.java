package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContainsNumber {

    public static String findNumber(List<Integer> arr, int k) {
        return arr.contains(k) ? "YES": "NO";
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukka Nilai K = ");
        System.out.println(findNumber(arr,scan.nextInt()));
    }


}