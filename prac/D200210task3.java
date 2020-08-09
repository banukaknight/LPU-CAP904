import java.util.Scanner;

class D200210task3
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter number to get fa factorial of : ");
int num= scan.nextInt();
int fact=1;
for(int i=num; i>1; i--){
	fact*=i;
	}

System.out.println("Factorial of " + num + " is: " + fact);



}
}