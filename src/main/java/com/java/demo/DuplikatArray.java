package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplikatArray {

    static List<Integer> duplikatArray(int[] numbers){
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (!output.contains(numbers[i]) && numbers[i] == numbers[j])output.add(numbers[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,2,3,5,6,10,10};
        System.out.println(duplikatArray(numbers));
    }
}
