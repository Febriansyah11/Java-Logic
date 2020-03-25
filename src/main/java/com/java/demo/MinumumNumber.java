package com.java.demo;

import java.util.Arrays;

public class MinumumNumber {

    public static int minimum(int[] coins, int numberOfCoins, int totalSum){
        int tempTable[] = new int[totalSum + 1];
        tempTable[0] = 0;
        for (int i = 1; i <= totalSum ; i++) {
            tempTable[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= totalSum; i++)
        {
            for (int j = 0; j < numberOfCoins; j++)
                if (coins[j] <= i) {
                    int result  =  tempTable[i - coins[j]];
                    if (result != Integer.MAX_VALUE && result + 1 < tempTable[i]){
                        tempTable[i] = result + 1;
                    }
                }
        }
        if (tempTable[totalSum] == Integer.MAX_VALUE){
            return 0 ;
        }else {
            return tempTable[totalSum];
        }
    }

    public static void main(String[] args) {
        int coins[] = {1, 3, 5};
        int totalSum = 11;
        int numberOfCoins = 3;
//        System.out.println(Arrays.toString(tempTable));
        System.out.println(minimum(coins, numberOfCoins, totalSum));
    }
}

