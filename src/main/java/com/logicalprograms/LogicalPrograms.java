package com.logicalprograms;
import java.security.SecureRandom;
import java.util.*;

public class LogicalPrograms 
{

    static void randomGenerator(int number) {
		SecureRandom r= new SecureRandom();//This class provide cryptographically strong random number generator (RNG). 
		int i=1;
		while(i<=number) {
			int Coupon=r.nextInt(number*number);
			System.out.println(Coupon);
			i++;
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Logical Programs" );

        System.out.println("Enter The No. Of Coupon Numbers You Want:");
		Scanner input =new Scanner(System.in);
		int number=input.nextInt();
		randomGenerator(number);
    }
}
