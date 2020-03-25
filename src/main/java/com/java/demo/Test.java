package com.java.demo;

import java.util.Arrays;

public class


Test {

            public static double majorityElement(double[] num) {
            double maxValue = 0, maxCount = 0;
            for (int i = 0; i < num.length; ++i) {
                int count = 0;
                for (int j = 0; j < num.length; ++j) {
                    if (num[j] == num[i]) ++count;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = num[i];
                }
            }
            return maxValue;
        }

    public static void main(String[] args) {
        double A[] = {61,63,63,67,67,68,70};
        System.out.println(majorityElement(A));
    }
}
