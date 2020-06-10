package com.java.demo;

public class TriangleNumber {

	public static void main(String[] args) {

		int x = 1;
		int y = 5;
		int z = 0;
		boolean a = true;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {

				if (z == 0) {
					System.out.print(1);
				} else {
					System.out.print(z + 1);
				}
				if (z == 5) {
					a = false;
				}
				if (a == true) {
					z += 1;
				}else if (z > 0) {
					z -= 1;
				}
				if (z == 0) {
					a = true;
				}
			}
			x += 1;
			System.out.println();
		}
	}

}
