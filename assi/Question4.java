//4. Create a program which takes user input of type String and then delete all the consonants from the string.

import java.util.Scanner;

class Question4{
		
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string: ");
		
	String myString = scan.nextLine();
	//delete all constants and leave only vowels
	myString = myString.replaceAll("([^aeiouAEIOU])","");
	System.out.println("Output : " + myString);
		
	}//end main
}//end class Question4