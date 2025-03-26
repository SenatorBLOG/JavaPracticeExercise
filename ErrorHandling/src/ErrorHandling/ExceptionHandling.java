package ErrorHandling;

import java.util.*;


public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0; i<arr.length;i++) {
			try {
				System.out.println("Enter an element");
				arr[i]=input.nextInt();
			}catch(InputMismatchException ex) {
				System.out.println("Wrong input");
			}
			input.nextLine();
			
		}
		System.out.println("these are array elements.");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		int numertor=1, denominator,result=0;
		try {
			System.out.println("Enter numertor: ");
			numertor = input.nextInt();
			System.out.println("Enter denominator: ");
			denominator = input.nextInt();
			
			result = numertor/denominator;
			System.out.println("result " + result);
			System.out.println("result + result");
		}
		catch(ArithmeticException ex) {
			//    System.out.println("An exception");
			result = numertor/1;
			System.out.println(ex.getMessage());
		}
		catch(InputMismatchException ex) {
			System.out.println("An exception");
		}
		catch(Exception ex) {
			System.out.println("An exception");
		}
		finally {
			System.out.println("result " + result);
		}
		
		System.out.println("rest ot the code");
	}

}
