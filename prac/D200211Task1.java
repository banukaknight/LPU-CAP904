import java.lang.Math;
import java.util.Scanner;

class D200211Task1
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter x1 & y1: " );
double x1=scan.nextDouble();
double y1=scan.nextDouble();

System.out.println("Enter x2 & y2: " );
double x2=scan.nextDouble();
double y2=scan.nextDouble();

double temp= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));


System.out.println("Length between two points is: " + temp);

}
}