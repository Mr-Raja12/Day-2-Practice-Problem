
public class SunOfNaturalNumber {
	public static void main(String[] args) {
        int n = 5, sum = 0, i = 1;
 
        /* While loop*/
 
        // Test condition
        while (i <= n) {
 
            /* Statements to execute */
 
            // Update the current sum till
            // test condition holds true
            sum = sum + i;
 
            // Increment the variable counter
            // or jumping to next natural number
            i++;
        }
 
        // Print the sum
        System.out.println(
            "Sum of natural numbers using while loop is:"
            + " " + sum);			
	}

}
