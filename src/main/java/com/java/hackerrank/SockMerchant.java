package com.java.hackerrank;

import java.util.Arrays;

public class SockMerchant {
    // search same value in array
    static int sockMerchant(int n, int[] ar) {

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar)+ " sort");
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i < n && ar[i] == ar[i + 1]) {
                total++;
                i = i + 1;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int n = 9;
        int[] sock = {30,10,20,20,40,20,10,30,40};
        System.out.println(sockMerchant(n, sock));

    }
}
