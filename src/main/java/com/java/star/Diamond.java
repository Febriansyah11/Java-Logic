package com.java.star;

public class Diamond {

    public static void main(String[] args) {
        int size = 5;
        int trimUp = size;
        int trimBottom = size;
        segitiga(size,trimUp,trimBottom);
        // for pertama untuk jumlah column(size)


        }

        static void segitiga (int size, int trimUp, int trimBottom){
            for (int column = 1; column <= size ; column++) {

                // for kedua untuk membuat spasi
                for (int space = 1; space < trimUp ; space++) {
                    System.out.print(" ");
                }
                // for kedua untuk object(star)
                for (int star = 1; star < column; star++) {
                    System.out.print("* ");
                }
                trimUp--;
                System.out.println();
            }
        }

    }

