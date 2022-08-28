//input number 121 ---->121
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		int n,c,r,s=0;
		System.out.println("Enter any number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
			System.out.println("Palindome number");
		else
			System.out.println("Not Palindrom number");
	}
	

}
