/*
 * Ricky Cai
 * CS3120 THURSDAY Evening.
 */
import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		//Declaring Variables
		int num1,num2, sum;
		Scanner stdin;
		
		//Declaring Scanner to recieve input
		stdin = new Scanner( System.in );
		
		//Print Statement for user
		System.out.print("Enter two numbers: ");
		
		//Storing the numbers and doing calculation for sum
		num1 = stdin.nextInt();
		num2 = stdin.nextInt();
		sum = num1 + num2;
		System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
		
	
	}

}