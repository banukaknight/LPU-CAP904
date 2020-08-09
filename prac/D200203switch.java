import java.util.Scanner;

class D200203switch
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	
	int choice = 0;
	
	do {
	System.out.println("\nEnter imput between 1-7 for Sunday-Saturday.\n 0 to exit program");
		choice = scan.nextInt();
	
	switch(choice)
	{
		case 1:
		System.out.println("Sun");
		break;
		
		case 2:
		System.out.println("Mon");
		break;
		
		case 3:
		System.out.println("Tus");
		break;
		
		case 4:
		System.out.println("Wed");
		break;
		
		case 5:
		System.out.println("Thu");
		break;
		
		case 6:
		System.out.println("Fri");
		break;
		
		case 7:
		System.out.println("Sat");
		break;
		
		default:
		System.out.println("Invalid Input");
		break;
	
	}//switch
	}while (choice!=0); //while

}//main
}//class