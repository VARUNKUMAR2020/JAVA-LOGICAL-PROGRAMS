package com.logicalprograms;
import java.util.*;;

public class LogicalPrograms 
{
    public static void main( String[] args )
    {
        System.out.println( "Logical Programs" );
        Scanner input=new Scanner(System.in);
		long start,end;
		double time;
		System.out.println("Type any character to Start the stopwatch :");
		char startTime=input.next().charAt(0);
		start=System.currentTimeMillis();// Returns the current time in milliseconds.
		
		System.out.println("Type any character to Stop the stopwatch :");
		char endTime=input.next().charAt(0);
		end=System.currentTimeMillis();
		
		time=(end-start)/1000.0;
		System.out.println("Elapsed Time :: "+time);
    }
}
