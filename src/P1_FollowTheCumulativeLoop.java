import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
1. Fill out the table for the loop below for the user inputs:
4 3 5 2 6

	| ITERATION 		 | VARIABLE NAME	 | VARIABLE NAME	 | VARIABLE NAME	 |
	| initialization	 |				 |				 |				 | 
	| 				 |		nextInputValue		 |		accumulatorVariable		 |				 |
	| 		1		 |				4            |			4	                 |				 |
	| 		2		 |				3            |			3	                 |				 |
	| 		3		 |				5            |			3	                 |				 |
	| 		4		 |				2            |			2	                 |				 |
	| 		5		 |				6            |			2	                 |				 |
	The accumulated value is: 2 
*/

/*
2. What is does this algorithm accomplish? (i.e., what does it compute or find?)
	This algorithm finds a lowest numbers from user input.

*/

public class P1_FollowTheCumulativeLoop {
	
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int accumulatorVariable = Integer.MAX_VALUE;
		for( int numberIndex = 1; numberIndex <= 5; numberIndex++ ) {
			
			// Enter the values in this order: 4 3 5 2 6
			System.out.print("Enter number " + numberIndex + ": ");
			int nextInputValue = input.nextInt();
			
			if( nextInputValue < accumulatorVariable ) {
				accumulatorVariable = nextInputValue;
			}
		}
		
		System.out.println("The accumulated value is: " + accumulatorVariable);

	}
}
