import java.util.Scanner;
public class To_Find_Max_And_Min {
	public static void main(String[] args) {
		int a,b,c;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter 1st number");
		a=r.nextInt();
		System.out.println("Enter 2st number");
		b=r.nextInt();
		    System.out.printf("Sum of two integers: %d%n", a + b);
	        System.out.printf("Difference of two integers: %d%n", a - b);
	        System.out.printf("Product of two integers: %d%n", a * b);
	        System.out.printf("Distance of two integers: %d%n", Math.abs(a - b));
	        System.out.printf("Max integer: %d%n", Math.max(a, b));
	        System.out.printf("Min integer: %d%n", Math.min(a, b));
	    }
	}

	


