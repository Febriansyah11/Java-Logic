package com.java.demo;

public class Loop {

	public static void main(String[] args) {

		int x = 0;
		int hasil = 5;
		int y = 5;
		
		for (int i = 0; i < y ;i++) {
			System.out.print(x + hasil);
			hasil += x;
			x += 5;
		}
	}

}
