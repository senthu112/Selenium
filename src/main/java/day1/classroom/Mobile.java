package day1.classroom;

public class Mobile {

String getNumber()
{
		System.out.println("make a call to");
		return "Hari";
		}
String sendSMS()
	{
		System.out.println("send SMS");
		return "Hi";
	}
String shutdown()
	{
		System.out.println("shutdown the process");
		return "shutdowncompleted";
	}
public static void main(String [] args)
{
	Mobile process =new Mobile ();
	String call=process.getNumber();
	System.out.println(call);
	String sms=process.sendSMS();
	System.out.println(sms);
	String shut=process.shutdown();
	System.out.println(shut);
}

}


