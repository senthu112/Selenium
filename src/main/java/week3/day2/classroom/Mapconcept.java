package week3.day2.classroom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapconcept {

	public static void main(String[] args)
	{
		
		//input value passing
		String name="ssenthilnathan";
		
		char[] charArray = name.toCharArray();
	//Creating an Emptymap
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for (char c : charArray) 
			{
			if(map.containsKey(c))
			{
				int cnt=map.get(c)+1;
				map.put(c,cnt);
				
				
	
			}
			else {
				map.put(c,1);
			
				}
			
	}
	System.out.print(map);
}
}