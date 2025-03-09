package Recursion;

public class Recursion {
	public static void main(String[] args) {
	String name = "Mikhail";
	//display(5);	
	
	System.out.println(sumOf(6));
	}
	
	//the Fibbonachi series
	public static int fib(int n) {
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	
	
	public static int sumOf(int n){
		if(n==1) {
			return 1;
			
		}
		else {
			return n + sumOf(n-1);
		}
	}
	public static void display(int n) {
		if(n==1) {
			System.out.println(n + "JAVA");
			System.out.println(n + "JAVA");
		}
		else {
			System.out.println(n + "JAVA");
			display(n-1);
		}
	}
}
