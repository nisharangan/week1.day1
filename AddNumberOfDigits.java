package nisha;

public class AddNumberOfDigits {

	public static void main(String[] args) {
		int number = 492;
		int remainder_number;
		int sum = 0;
		do {

			remainder_number = number % 10;
			number = number / 10;

			sum = sum + remainder_number;
		} while (number != 0);

		System.out.println("Sum of the given number 492 is :" + sum);
	}

}
