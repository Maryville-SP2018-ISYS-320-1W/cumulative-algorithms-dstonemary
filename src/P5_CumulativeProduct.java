import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("How many numbers will you multiply? ");
		int numbers = input.nextInt();
		int multiplyNumber = 1;
		for( int i = 1; i <= numbers; i++ ) {
			System.out.print("Enter number " + i + ": ");
			int number = input.nextInt();
			multiplyNumber = multiplyNumber * number;
		}
		System.out.println("The final product is "+multiplyNumber);
		
	}

}
