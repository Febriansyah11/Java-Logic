package com.java.demo;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {

    static List<String> retainAll(List<String> pascal, List<String> izmi){
        pascal.retainAll(izmi);
        return pascal;
    }
    static List<String> manualRetainAll(List<String> pascal, List<String> izmi) {
        List<String> sameValue = new ArrayList<>();
        for (String classA : pascal) {
            for (String classB : izmi) {
                if (classA.equals(classB)) {
                    sameValue.add(classA);
                }
            }
        }
        return sameValue;
    }

    public static void main(String[] args) {
        List<String> pascal = new ArrayList<>();
        pascal.add("Letto");
        pascal.add("Winggar");
        pascal.add("Selly");

        List<String> izmi = new ArrayList<>();
        izmi.add("Febri");
        izmi.add("Pindo");
        izmi.add("Selly");

        System.out.println(pascal+ " Pascal Class");
        System.out.println(izmi+ " Izmi Class");
        System.out.println();
        System.out.println(manualRetainAll(pascal, izmi)+ " Manual Same Value In Array");
        System.out.println(retainAll(pascal, izmi) + " Library Same Value In Array");
    }
}
