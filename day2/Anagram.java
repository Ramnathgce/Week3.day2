package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String text1 = "stops";

			String text2 = "potss"; 
		// Check length of the strings are same then (Use A Condition)
		 if(text1.length()==text2.length())
		 {
		// Convert both Strings in to characters
		   char[] ch1=text1.toCharArray();
		   char[] ch2=text2.toCharArray();
		// c) Sort Both the arrays
		   //if(ch1[0] == ch2[3])
			  // System.out.println("----"+ch1[0]);
		   Arrays.sort(ch1);
		   Arrays.sort(ch2);
		   if(Arrays.equals(ch1, ch2)) 
		   {
		   System.out.println("ANAGRAM");
		   }
		   else
			   {
			   System.out.println("Not an Anagram");
			      }
		 //Check both the arrays has same value
		 }		 		
	}
}

