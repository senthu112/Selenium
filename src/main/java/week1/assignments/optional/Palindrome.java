package week1.assignments.optional;

import java.util.Arrays;
public class Palindrome {

	public static int i;
	public static void main (String[] args) {
		
		String text="madam";
		String rev="";
		char [] ch=text.toCharArray();
		for (int i=ch.length-1;i>=0;i--) 
		{
		rev+=ch[i];
		
		}
		System.out.println("reversal order of given string:"+rev);
		
		if (text.equals(rev))
		{
		System.out.println("its a palindrome");
		
		}
		else
		{
			System.out.println("its not a palindrome");
		}
	}
	
	
}
