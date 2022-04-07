package week3.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
//				 	 
//		 // Declare String Input as Follow
//		  
//		   String test = "changeme";
//		 
//		 // a) Convert the String to character array
//			   char array[] =test.toCharArray();
//		   
//		// b) Traverse through each character (using loop)
//			   for (int i = 0; i < array.length; i++) {
//		
//		// c)find the odd index within the loop (use mod operator)
//		   if (array[i]%2 !=0) 	 
//		{
//			String index =index(array[i]);
//			System.out.println("Print odd index"+ index);
//		}	
//		}
//		 // d)within the loop, change the character to uppercase, if the index is odd else don't change
//		     String uppertest= test.toUpperCase();
//		     System.out.println(uppertest);
//		 }
		 String test = "changeme";
	char ch[] = test.toCharArray();
   
    
    for (int i = 0; i < ch.length; i++) {
  	  
  	if (ch[i]%2 !=0)
			System.out.println(Character.toUpperCase(ch[i]));
  
		else
			System.out.println(ch[i]);
	}
    
		
	}
}

