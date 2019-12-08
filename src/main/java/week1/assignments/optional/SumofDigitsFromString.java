package week1.assignments.optional;

import org.apache.poi.ss.formula.functions.Replace;
public class SumofDigitsFromString {

public static void main(String[] args)
{
	String text="Tes12Le79af65";
int sum =0;	
String text1=text.replaceAll("\\D","");
System.out.println(text1);
char [] ch=text1.toCharArray();
for (int i=0;i<=ch.length-1;i++)
{
	int s=Character.getNumericValue(ch[i]);
	sum=sum+s;
	
}
System.out.println("Sum of total digits\t"+sum);



}
	
}
