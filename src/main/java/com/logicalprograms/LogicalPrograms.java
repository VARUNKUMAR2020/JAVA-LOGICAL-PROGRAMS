package com.logicalprograms;
import java.util.*;
public class LogicalPrograms 
{
    public static void main( String[] args )
    {
        System.out.println( "Logical Programs" );
        System.out.println("Enter a number to check if it is Perfect Number or not :");
		Scanner input = new Scanner(System.in);
		int number= input.nextInt();
		int sum = 0;
		System.out.println(number+" is divisible by:");
        // running loop for checking the condition
		for(int integer=1; integer<number; integer++) {
			if( number%integer == 0) {
				System.out.println(integer);
				sum+=integer;
			}
		}
		System.out.println("\nSum of divisors :"+sum);
        // condition to check sum of the divisor is equal or not
		if ( number == sum) {
			System.out.println("\n"+number+" = "+sum);
			System.out.println("Perfect Number.");
		}
		else {
			System.out.println("\n"+number+" != "+sum);
			System.out.println("Not a Perfect Number.");
		}
    }
}
