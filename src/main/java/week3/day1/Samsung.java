package week3.day1;

public class Samsung extends Mobile{
	
	public void bikeMode()
	{
		System.out.println("Bike mode is on");
	}
	public void sendsms()
	{
		System.out.println("say text");
	}
	public String getmodel()
	{
System.out.println("the old model is");
		return "samsungs3";
	}
	public String getmodel(String s)
	{

     return s;
	}
	
/*	public String getmodel(String who)
	{
		if (who.equals("senthu"))
		{
			return "s5";
		}
			else
				return "s7";
	}*/
}