package assignment2;

public class Fibonacci {
	/**
	 * This method will return the nth term in the fibonacci sequence
	 * where n is the desired term in the fibonacci sequence.
	 * @param n The integer n that is passed to this method will be the nth term calculated for the fibonacci sequence.
	 * @return Returns an integer value for the number that is at the nth term of the fibonacci sequence.
	 */
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
