import java.util.Scanner;

class D200210task2
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter number to get multiples of : ");
int num= scan.nextInt();
System.out.println("Enter End limit for the printling list: ");
int last= scan.nextInt();

for(int i=num; i<=last; i+=num){
	System.out.print(i + ", ");	
}




}
}