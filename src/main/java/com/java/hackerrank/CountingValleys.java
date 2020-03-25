package com.java.hackerrank;

import java.io.BufferedWriter;

public class CountingValleys {
// bentuk lembah
//    _/\       _
//       \     /
//        \/\/



    static int countingValleys(int n, String s) {
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for (char c : s.toCharArray()) {
            if (c == 'U') lvl++;
            if (c == 'D') lvl--;

            // if we just came UP to sea level
            if (lvl == 0 && c == 'U')
                ++v;
        }
        return v;
    }


    public static void main(String[] args) {
        int n = 8;
        String s = "UDDDUDUU";
        System.out.println(countingValleys(n,s));
    }
}
