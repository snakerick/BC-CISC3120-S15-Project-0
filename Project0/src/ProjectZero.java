/*
 * Ricky Cai
 * CS3120 THURSDAY Evening.
 */
import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		//Declaring Variables
		Scanner stdin;

		//Declaring Scanner to recieve input
		stdin = new Scanner( System.in );
		
		//The program will assume that the user will enter "INT" first
		try { 
			int num1,num2, sum;
			//Print Statement for user
			System.out.print("Enter two numbers: ");

			//Storing the numbers and doing calculation for sum
			num1 = stdin.nextInt();
			num2 = stdin.nextInt();	
			sum = num1 + num2;
			
			System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
		
			
		} 
		
		//If the numbers enter is not Int's it will do the catch and use double instead.
		catch (java.util.InputMismatchException e) {
			
			//Declare variables for Double and calculating for sum
			double num1,num2,sum;
			num1 = stdin.nextDouble();
			num2 = stdin.nextDouble();
			sum = num1 + num2;
			
			System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
		} 
		//Finally is used to close the stdin because Finally always executes no matter what.
		finally { 
			stdin.close(); 
		}
	}
}