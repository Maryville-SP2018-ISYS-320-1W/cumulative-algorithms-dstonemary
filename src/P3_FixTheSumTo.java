/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
3. What problems did you identify in the sumTo method below?
	The problem was in method "sumTo" which had not return statement of sum of 5 numbers and second problem was the variable sum 
	was initialized locally inside loop control statement instead method.   

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
		int sum = 0; 
	    for (int i = 1; i <= n; i++) {	        
	        sum += i;
	    }
	    return sum;
	}

}
