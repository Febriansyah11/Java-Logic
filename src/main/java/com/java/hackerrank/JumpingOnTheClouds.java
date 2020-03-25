package com.java.hackerrank;

public class JumpingOnTheClouds {

    static int clouds(int[] n) {
        int count = -1;
        for (int i = 0; i < n.length; i++, count++) {
            if (i < n.length - 2 && n[i + 2] == 0) i++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] n = {0, 0 , 0, 0, 1, 0};
        System.out.println(clouds(n));
    }

}
