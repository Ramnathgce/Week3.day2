package week3.day2;

public class RemoveDuplicates_Assignment {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//String text = "We learn java basics as part of java sessions in java week1";		
//		char[] ch= text.toCharArray();
//		// Initialize an integer variable as count
//		int count=0;
//		 // Split the String into array and iterate over it 
//// Initialize another loop to check whether the word is there in the array
//    for (int i = 0; i < ch.length; i++) {
//		if (char[i] = "split");
//		
//    }
//		//if it is available then increase and count by 1. 
//    count++;
//		// if the count > 1 then replace the word as "" 
//		 
//		 //g) Displaying the String without duplicate words	
//		 //
//
//	}
	public static void main(String[] args) {

		String str = "We learn java basics as part of java sessions in java week1";

		String[] eachWords = str.split("\\s+");
		int length = eachWords.length;
		System.out.println(length);
		for (int i = 0; i < eachWords.length; i++) {

			for (int j = i + 1; j < eachWords.length; j++) {

				if ((eachWords[i].equals(eachWords[j]))) {

					eachWords[j] = " ";
				}
			}
			System.out.print(eachWords[i] + " ");
		}
	}
}

