import java.util.Scanner;

class D200210task5atmpt2
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter number to reverse :");
int num = scan.nextInt();
int temp1=0,temp2=num;

do{
	temp1=temp2%10;
	temp2=temp1/10;
	
}while (temp2>10);





}
}