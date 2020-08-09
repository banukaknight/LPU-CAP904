import java.util.Scanner;

class D200203SwitchLttr
{
public static void main(String args[])
{
char letter;
Scanner scan = new Scanner(System.in);

do{
System.out.println("\nEnter a single alphabet character to check if a vowel.\nEnter 0 to exit");
letter = scan.next().charAt(0);
letter = Character.toLowerCase(letter);
switch(letter)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(">>Enterd character is a vowel");
break;

default:
System.out.println(">>Enterd character is not a vowel");
break;

}//switch

}while(letter != '0'); //end dowhile

}//main
}//class