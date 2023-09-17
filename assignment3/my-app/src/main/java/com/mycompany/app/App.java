package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int fibonacciNthTerm(int n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return fibonacciNthTerm(n - 1) + fibonacciNthTerm(n - 2);
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.print("The " + num + "th number in the fibonacci sequence is: " );
		System.out.println(fibonacciNthTerm(num));
	}
}
