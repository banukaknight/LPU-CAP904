import java.util.Scanner;

class Ca2_1
{
public static void main(String args[])
{

int i=1; //counter
int temp; //temp value

Scanner scan=new Scanner(System.in);

System.out.println("Enter upper range for series: ");
int upl = scan.nextInt();

while(i<=upl)
{
temp=(int)Math.pow(i,2);
i++;

if(temp>upl)
{break;} //if range exceeded break out of loop

if((temp%3==0)||(temp%7==0))
{ continue;} //if divisable by 3 or 7 skip iteration
else
{
System.out.print(temp + ", ");
}
}//end while

System.out.println("\n\nThis series contains power of consecetive number up to the given range: " + upl);
System.out.println("It skips any number divisable by 3 or 7");


}//end of main
}//end of class