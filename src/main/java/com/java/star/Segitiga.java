package com.java.star;

public class Segitiga {

    public static void main(String[] args) {
        int tinggi = 5;
        for (int i = 0; i <=tinggi ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i <= tinggi ; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        int trim = tinggi;
        for (int i = 0; i <=tinggi ; i++) {
            for (int space = 0; space <trim ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            trim--;
            System.out.println();

        }

        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = tinggi; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        int spasi= tinggi;
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <spasi-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            spasi--;
            System.out.println();
        }
        for (int i = 1; i <tinggi ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = tinggi; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <i  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = tinggi; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        int spc =tinggi;
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 1; j <spc ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" *");
            }
            spc--;
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = tinggi; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = tinggi; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        int s = tinggi;
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j < s ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" *");
            }
            s--;
            System.out.println();
        }
        for (int i = 0; i <tinggi ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = tinggi; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
