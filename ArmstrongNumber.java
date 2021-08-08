package assignments;

public class ArmstrongNumber {
	
	//Program to find whether the given number is an Armstrong number or not
	
	public static void main(String[] args) {
		int number = 371;
		int given_number = 371;
		int cube = 0;
		int remainder_number;

		do {
			remainder_number = number % 10;
			number = number / 10;
			cube = cube + (remainder_number * remainder_number * remainder_number);
			
		} while (number != 0);
		System.out.println("Cube :" +cube);

		if (given_number == cube) {
			System.out.println("The given number is a Armstrong number");
		} else

			System.out.println("The given number is not an Armstrong number");
	}

}
