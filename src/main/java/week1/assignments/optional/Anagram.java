package week1.assignments.optional;

import java.util.Arrays;
public class Anagram {

	public static void main (String [] args) {
		String text1="stop";
		String text2= "to0s";
		
if (text1.length()==text2.length())
{
	char [] ch=text1.toCharArray();
	char [] ch1=text2.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(ch1);
	if (Arrays.equals(ch,ch1)) 
	{
		System.out.println("Its an anagram");
		
	}
	else
	{
		System.out.println("its not an anagram");
	}
		
}
	
		
	}
}

