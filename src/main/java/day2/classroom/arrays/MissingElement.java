package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8,10};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
	Arrays.sort(data);
//	int f=data[0];
	for(int i=0;i<data.length;i++) {
		//int s=f+1;
		if (i+1<data.length) {
			
	//	System.out.println(data[i]+1);
		if (data[i]+1==data[i+1])
		{
			//System.out.println("Missing value"+s);
	
		}
		else {
			System.out.println("Missing value"+ (data[i]+1));
		}
		}
	}
		
		
		// Print the second largest number	
		
		
	}

}
