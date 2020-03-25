package com.java.demo;

public class Latihan {
    // [1,2,2,4,3,5]
    public static void main(String[] args) {
       int arr[] = {1,2,2,4,3,5};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int x = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                   if (arr[i] == arr[j]){
                       x = arr[i];
                   }
            }
        }
        return x;
    }
}
