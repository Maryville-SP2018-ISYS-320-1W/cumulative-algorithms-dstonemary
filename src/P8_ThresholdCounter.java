import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P8_ThresholdCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("How many numbers are in the series? ");
		int numbers = input.nextInt();
		System.out.print("What is the threshold? ");
		int thresholdNum = input.nextInt();		
		int thresholdNumCount = 0;
		for( int i = 1; i <= numbers; i++ ) {
			System.out.print("Enter number " + i + ": ");
			int number = input.nextInt();
			if(number > thresholdNum)
				thresholdNumCount++;
		}
		System.out.println("The count of numbers above the threshold is "+thresholdNumCount);
	}

}
