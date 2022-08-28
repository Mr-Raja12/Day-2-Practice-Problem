
public class NumberToWord { 
	static void numberToWords(char num[])  
	{  
	int len = num.length, x = 0;  
	if (len == 0)   
	{  
	System.out.println("The string is empty.");  
	return;  
	}      
	String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};     
	if (len == 1)   
	{  
	System.out.println(onedigit[num[0]-'0']);  
	return;  
	}   
	System.out.println(onedigit[num[x] - '0']);  
	}  
	public static void main(String args[])  
	{    
	numberToWords("10".toCharArray());  
	numberToWords("0".toCharArray());   
	}  
	}  
