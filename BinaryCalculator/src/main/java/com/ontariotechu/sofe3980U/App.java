package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;  // Import the Scanner class

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args ) {
		LocalTime currentTime = new LocalTime();
		System.out.println("\nThe current local time is: " + currentTime);

		Scanner scan = new Scanner(System.in); //create Scanner object
		System.out.println("Enter your first binary number: ");
		String num1 = scan.nextLine();  // Read user input
		System.out.println("Enter your second binary number: ");
		String num2 = scan.nextLine();  // Read user input

		Binary binary1=new Binary(num1);
        System.out.println( "\nFirst binary number is "+binary1.getValue());
		Binary binary2=new Binary(num2);
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "\nTheir sum is "+sum.getValue());
		Binary or = Binary.or(binary1, binary2);
		System.out.println( "The value after the or operation is " + or.getValue());
		Binary and = Binary.and(binary1, binary2);
		System.out.println( "The value after the and operation is " + and.getValue());
		Binary multiply = Binary.multiply(binary1, binary2);
		System.out.println( "Their product is " + multiply.getValue());
    }
}
