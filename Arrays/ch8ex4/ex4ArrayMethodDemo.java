package ch8ex4;

import java.util.Arrays;
import java.util.Scanner;

public class ex4ArrayMethodDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 10 intigers.");
		
		int tenInt []= new int[10];
		
		for (int i = 0; i< tenInt.length;i++) {
			System.out.println("Enter " + (i+1) + " integer number.");
			tenInt[i]=scanner.nextInt();
		}
		display(tenInt);
		display2(tenInt);
		
		
		scanner.close();
	}
	private static void display(int[] tenInt) {
		System.out.println("Your array is ");
		for(int num : tenInt) {
			System.out.print(" " + num);
		}
		System.out.println();
	}
	private static void display2(int[]tenInt) {
		System.out.println("Your array in reverse ");
		for(int i=tenInt.length-1; i>=0;i--) {
			System.out.print(" " + tenInt[i]);
		}
		System.out.println();
	}
}

	



