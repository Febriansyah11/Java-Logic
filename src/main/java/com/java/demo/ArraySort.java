package com.java.demo;

import java.util.Arrays;

public class ArraySort {

    static String sort(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return Arrays.toString(numbers);
    }


    public static void main(String[] args) {
        int[] numbers = {20,30,21,23,6,8,9,1,2,0};
        System.out.println(sort(numbers)+ " Manual Sorting");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers) + " Java Library Sorting");
    }
}
