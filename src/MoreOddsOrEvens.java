import java.util.Scanner;


public class MoreOddsOrEvens {

	
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("How many numbers will you input? ");
		int numbers = input.nextInt();			
		int evenNumCount = 0;
		int oddNumCount = 0;
		for( int i = 1; i <= numbers; i++ ) {
			System.out.print("Enter number " + i + ": ");
			int number = input.nextInt();
			if((number % 2) ==0)
				evenNumCount++;
			else
				oddNumCount++;
		}
		if(evenNumCount > oddNumCount)
			System.out.println("You entered in more even numbers than odd numbers.");
		else if(evenNumCount < oddNumCount)
			System.out.println("You entered in more odd numbers than even numbers.");
		else
			System.out.println("Both entered in odd and even are same count");
	}

}
