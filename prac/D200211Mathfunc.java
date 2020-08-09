import java.util.Scanner;
import java.lang.Math;


class D200211Mathfunc
{
public static void main(String args[])
{

Scanner scan=new Scanner(System.in);

System.out.println("Enter 3 numbers: ");
double x = scan.nextDouble();
double y = scan.nextDouble();
double z = scan.nextDouble();

System.out.println("you entered: " +x + " & "+y);

System.out.println("ABS: "+ Math.abs(z));
System.out.println("sqrt: "+ Math.sqrt(x));
System.out.println("pow: "+ Math.pow(x,y));
System.out.println("ceil: "+Math.ceil(z));
System.out.println("floor: "+Math.floor(z));
System.out.println("round: "+Math.round(z));
System.out.println("hypot: "+Math.hypot(x,y));
System.out.println("max: "+Math.max(x,y));
System.out.println("min: "+Math.min(x,y));
System.out.println("random: "+Math.random());



}//main
}//class