import java.util.Scanner;

class D200203SwitchCalc
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
double num1, num2, temp;
String inp;

do{
System.out.println("\n\nEnter 2 numbers for calculation");
num1 = scan.nextDouble();
num2 = scan.nextDouble();

System.out.println("Enter desired calculation method. Options:");
System.out.println("\nAdd\nSubstract \nmultiply\ndivide \nminimum\nmaximum \n exit to exit program");
inp = scan.next();
inp = inp.toLowerCase();//convert to lowercase

switch(inp)
{
case "add":
System.out.println("Sum is: " + (num1 + num2));
break;
case "substract":
System.out.println("Substraction is: " + (num1 - num2));
break;
case "multiply":
System.out.println("Multiplication is: " + (num1*num2));
break;
case "divide":
System.out.println("Division is: " + (num1/num2));
break;
case "minimum":
temp = num1<num2?num1:num2 ;
System.out.println("Mimimum is: " + temp);
break;
case "maximum":
temp = num1>num2?num1:num2 ;
System.out.println("Maximum is: " + temp);
break;
case "exit":
break;
default:
System.out.println("Invalid input");
break;

}//switch

//}while(inp != "exit");//end do-while
}while(!("exit".equalsIgnoreCase(inp)));//end do-while

}//main
}//class