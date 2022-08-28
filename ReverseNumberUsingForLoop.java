//input number 123 ----->321
import java.util.Scanner;
public class ReverseNumberUsingForLoop {
	
    public static void main(String[] args) {
		int n,r;
		System.out.print("Enter any Number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		for(;n!=0;)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}
	}



