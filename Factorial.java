package assignments;

public class Factorial {
	//To find factorial of a given number
public static void main(String[] args) {
	int fact=1;
	for(int num=1;num<=5;num++) {
		fact=fact*num;	
	}
	System.out.println("The Factorial of 5 is: " +fact);
}
	
}
