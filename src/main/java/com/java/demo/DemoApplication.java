package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        {
            int i, j;
            int k = 0;
            j = 2;
            k = j += i = 1;
            System.out.println(k);
        }

    }

}
