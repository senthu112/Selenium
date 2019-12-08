package week3.day1;

public class Mymobile  {
	public static void main(String[] args) {
		
		Samsung s3=new Samsung();
		s3.bikeMode();
		s3.sendsms();
		s3.makecall();
		String s1=s3.getmodel();
		System.out.println(s1);
	
		String s=s3.getmodel("samsungs5");
		System.out.println("model name is:  "+s);
	}

		
	
}
