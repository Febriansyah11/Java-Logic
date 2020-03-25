package com.java.star;

public class Triangle {

    public static void main(String[] args) {
        for (int e = 0; e < 5; e++) {               // *****
            for (int f = 5; f > e; f--) {           // ****
                System.out.print("*");              // ***
            }                                       // **
            System.out.println(" ");                // *
        }

        for (int b = 1; b <= 5; b++) {              //      *
            for (int c = 4; c >= b; c--) {          //     **
                System.out.print(' ');              //    ***
            }                                       //   ****
            for (int d = 1; d <= b; d++) {          //  *****
                System.out.print('*');
            }
            System.out.println();
        }


        int x = 5;
        for (int i = 1; i <= x; i++) {              //     *
            for (int j = 4; j >= i; j--) {          //    ***
                System.out.print(' ');              //   *****
            }                                       //  *******
            for (int k = 1; k <= i; k++) {          // *********
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print('*');
            }
            System.out.println();
        }




        int m = 10;
        int n = 5;
        for (int o = 0; o < 10; o++) {
            for (int p = 10; p > o; p--) {
                System.out.print(" ");
            }
            for (int q = 0; q < o; q++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int r = 0; r < 10; r++) {
            for (int s = 0; s < r; s++) {
                System.out.print(" ");
            }
            for (int t = 10; t> r; t--) {
                System.out.print(" *");
            }
            System.out.println("");
        }


        for (int f = 0; f < 10; f++) {
            for (int s = 0; s < f; s++) {
                System.out.print(" ");
            }
            for (int t = 10; t> f; t--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}