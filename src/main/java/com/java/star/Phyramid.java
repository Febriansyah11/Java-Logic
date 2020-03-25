package com.java.star;

import java.util.Scanner;

public class Phyramid {

    public static void pyramidLine(int qty, int size) {
        int trim = size+1;
        int stars = 1;

        for (int column = 1; column <=size ; column++) {
            for (int line = 1; line <= qty ; line++) {
                for (int space = 1; space <= trim; space++) {
                    System.out.print(" ");
                }
                for (int star = stars; star <= column; star++) {
                    System.out.print("*");
                }
                for (int space = 1; space <= trim-2; space++) {
                    System.out.print(" ");
                }
            }
            trim--;
            stars--;
            System.out.println();
        }
    }

    public static void pyramidColumn(int qty, int size){

        // for pertama untuk jumlah phyramid
        for (int pyramid = 1; pyramid <= qty ; pyramid++) {

            int trim = size;
            // for kedua untuk ukuran (size) pyramid
            for (int column = 1; column <= size ; column++) {

                //for ke tiga untuk jarak spasi agar membentuk pyramid
                for (int space = 1; space <= trim; space++) {
                    System.out.print(" ");
                }

                // for ke keempat untuk print object nya
                for (int star = 1; star <= column; star++) {
                    System.out.print(" *");
                }
                trim--;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jumlah Phyramid :");
        int qtyPyramid = scan.nextInt();
        System.out.println("Tinggi Phyramid :");
        int sizePyramid = scan.nextInt();
        pyramidLine(qtyPyramid,sizePyramid);
        System.out.println();
        pyramidColumn(qtyPyramid, sizePyramid);
    }
}
