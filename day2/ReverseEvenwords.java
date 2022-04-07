package week3.day2;

public class ReverseEvenwords {

//	public static void main(String[] args) {
//	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
//	// Declare the input as Follow
//	     		String test = "I am a software tester"; 
//		// split the words and have it in an array
//	     		String[] split=test.split(""); 
//		// Traverse through each word (using loop)
//		for (int i = 0; i < split.length; i++) {
//			// find the odd index within the loop (use mod operator)
//			if(i%2 == 0)
//			{
//			//System.out.println("ODD POSITION "+split[i]);
//			for (int j = split[i].length() ; j > 0 ; j--) {
//				System.out.println(split[j]);
//			}
//		}}
//		//print the even position words in reverse order using another loop (nested loop)
//			//else {
//			//for (int j = split.length; j >0 ; j++) {
//				
//			//}}				
//	// Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
//	}
	public static void main(String[] args) {
//		String test="I am a software tester";
//		String[] newtest=test.split(test, 0);
//		System.out.println(newtest);
		
		    String text = "Hi welcome to team professioanls";
		    String[] words = text.split(" ");
		    
		    for (int i = 0; i < words.length; i++) 
		    {
		    	if(i % 2 == 1) 
		    	{
		    		for (int j = words[i].length()-1; j >= 0; j--) 
		    		{
						System.out.print(words[i].charAt(j));
					}
		    		System.out.print(" ");
		    	}
		    	else
		    	{
		    		System.out.print(words[i]+" ");
		    	}
		    }	    
		}
}
