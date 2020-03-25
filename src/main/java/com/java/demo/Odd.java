package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odd {
    public static List<Integer> odd(int a, int b) {
        List<Integer> list = new ArrayList<>();
//        if(l % 2 == 0){
//            l++;
//        }
//        while (l <= r){
//            list.add(l);
//            l += 2;
//        }
//        return list;
        while (a <= b) {
            list.add(a);
            a++;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nila L = ");
        int l = scanner.nextInt();
        System.out.print("Masukkan nilai R = ");
        int r = scanner.nextInt();

        System.out.println(odd(l,r));

    }
}
