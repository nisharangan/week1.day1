package assignments;

public class Factorial {
	
	// Program to find factorial of a given number
	
	public static void main(String[] args) {
		int number = 5;
		int fact = 1;
		
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of 5 is: " + fact);
	}

}
