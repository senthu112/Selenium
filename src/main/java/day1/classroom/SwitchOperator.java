package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) How to declare the varialbles i learnt
	 * 2) understood the usage of switch case need---> user can choose it from different operations avialable
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		
           int a=2,b=3;     
           String operations="c";
         
           switch (operations)
           { 
           case "a":
           int add=a+b;
        System.out.println("addition of two nos\n"+add);
        
           break;
           case "b":
        	   int sub=a-b;
        	   System.out.println("subtraction of two nos\n"+sub);
        	   break;
           case "c":
        	   int mul=a*b;
        	   System.out.println("multiplication of two nos\n"+mul);
        	break;
             case "d":
            	 int div=b/a;
            	 System.out.println("division of two nos\n"+div);
            	 break;
            	 default:
            	 System.out.println("exit");
        	   
        	   
		// Declare a String variable with input as operations (Tip:
		

		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
}