import java.util.Scanner;

class D200210task5
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter number to reverse :");
int num = scan.nextInt();
int rev, i=0;
String temp="";
int leng = String.valueOf(num).length();

do{
	temp = String.valueOf(num).charAt(i) + temp;
	i++;
}while(leng>i);

System.out.println("Reverese is : " + temp);

 rev = Integer.parseInt(temp);

if(num==rev){
	System.out.println("The number is a palindrome");
}else{
	System.out.println("The number is NOT a palindrome");
}

}//main
}//class