

import java.util.Scanner;
/**
 * 
 * @author RICKY
 * @version 1
 */
public class ProjectZero {
/**
 * 
 * @param args Regular Main Functions, adds 2 numbers together
 */

	public static void main(String[] args) {
		//Created Scanner call stdin
		Scanner stdin;
		stdin = new Scanner( System.in );
		
		//User enters two number it assumes that it is an INT
		try { 
			int num1,num2, sum;
			
			System.out.print("Enter two numbers: ");
			
			//If user enter two INT the number get store in num1 and num2
			num1 = stdin.nextInt();
			num2 = stdin.nextInt();	
			
			//The sum is then calculated.
			sum = num1 + num2;
			
			System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
		} 
		
		//If the number isn't an INT its assume that its a double.
		catch (java.util.InputMismatchException e) {
			
			//Stores the numbers in num1 and num2
			double num1,num2,sum;
			num1 = stdin.nextDouble();
			num2 = stdin.nextDouble();
			
			//Calculate the sum of both numbers
			sum = num1 + num2;
			
			System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
		} 		
		
		//Finally happens regardless, and the statement closes the scanner
		finally { 
			//Closes the scanner
			stdin.close(); 
		}
	}
}