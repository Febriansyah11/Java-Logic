package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverseCount {

    public static void main(String[] args) {
        int numArr[] = {123,235,444,765};
        List<String> result = new ArrayList<>();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numArr.length ; i++) {
            str.append(numArr[i]);
            str.reverse();
            String s = str.toString();
            Integer x = Integer.parseInt(s);
            int res = x - numArr[i];
            if (res == 0) result.add("*");
            if (res != 0) result.add("" + res);
            str.setLength(0);
        }
        System.out.println(result.toString());
    }
}
