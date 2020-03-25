package com.java.hackerrank;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        char[] cr = new char[(int)n];
        long count = 0;
        s.toLowerCase();
        for(int i = 0 ; i < n; i++){
            for(char c : s.toCharArray()){
                cr[i] = c;
                i++;
            }
        }
        for(char c : cr){
            if(c == 'a') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abc";
        long n = 10;
        System.out.println(repeatedString(s,n));
    }
}
