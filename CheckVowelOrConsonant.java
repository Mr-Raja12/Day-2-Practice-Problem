
import java.util.Scanner;

	public class CheckVowelOrConsonant {
		public static void main(String[] args) {
			
			char ch;
			System.out.print("Enter any character");
			
			Scanner r=new Scanner(System.in);
			ch=r.next().charAt(0);
			
			if(ch=='a' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.print("Vowel");
			}
			else
			{
				System.out.print("Consonant");
		}
				
		}

	}


