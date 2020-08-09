import java.util.Scanner;

class D200127Myp5_shft{
public static void main(String args[])
{
System.out.println("Enter number : ");
Scanner myscan = new Scanner(System.in);

int myno = myscan.nextInt();

myno = myno << 4;

System.out.println("Shifted value is: " + myno);


}
}