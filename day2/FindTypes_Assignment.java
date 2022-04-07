package week3.day2;

public class FindTypes_Assignment {

	public static void main(String[] args) {
		// Build the logic to find the count of each
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
	// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
// Convert the String to character array
	char[] ch= test.toCharArray();
//Traverse through each character (using loop)
  for (int j = 0; j < ch.length; j++) {
	
// Find if the given character is what type using (if)
	  //i)Character.isLetter
                 if(Character.isLetter(ch[j]))
			    	letter++;
	  //ii)Character.isDigit
			    else if(Character.isDigit(ch[j]))
			    	 num++;
	  //iii)Character.isSpaceChar
			     else if(Character.isSpaceChar(ch[j]))
			    	 space++;
      //iv) else -> consider as special character
			     else
			    	 specialChar++;
  }

				// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

	}

}
