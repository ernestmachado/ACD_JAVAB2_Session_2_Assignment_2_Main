package ASSIGNMENTS;

import java.util.Scanner;

public class Assignment2_2 {
	// Write a program to print the “X” pattern:
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("enter the number of rows=column");
		int n = s.nextInt();
		int i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (j == i) {
					System.out.print("*");
				} else if (j == n - (i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}