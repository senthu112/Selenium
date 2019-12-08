package day2.classroom.str;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/
char[] ch=test.toCharArray();
int n=test.length();
for (int i=n-1;i>=0;i--)
{
	System.out.print(ch[i]);

 
}
 /*for (int i=count-1;i>=0;i--) {
	s=s + test.charAt(i);
	 
 }System.out.println(s);
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		
		/*String s1="";
		for (int i=1;i<=count;i++) {
			s1 =s1+test.charAt(-i);
		}
		System.out.println(s1);
		}
		
		*/
		
	}}
		
		
	

