package com.java.demo;

import java.util.ArrayList;
import java.util.List;

public class ArraySameValue {


    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("mixer");
        a.add("gatau");
        a.add("mixer");
        a.add("mixer");
        a.add("gatau");
        a.add("mixer");
        a.add("abc");
        a.add("abc");
        a.add("gatau");
        a.add("abc");
        a.add("gatau");

        int c = 1;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    a.set(j, a.get(j) + c);
                    c++;
                }
            }
            c = 1;
        }
        for (String abc : a) {
            System.out.println(abc);
        }

    }

}
