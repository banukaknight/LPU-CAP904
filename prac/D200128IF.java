import java.util.Scanner;
class D200128IF
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int temp=1;

while(temp==1){

System.out.println("Enter first no: ");
int n1 = obj.nextInt();
System.out.println("Enter second no: ");
int n2 = obj.nextInt();

if(n1==n2)
{
System.out.println("Two numbers are the same");
}
System.out.println("...");
//--------------------------
if(n1==n2)
{
System.out.println("Two numbers are the same");
}else{
System.out.println("Two numbers are NOT the same");
}
//--------------------------
if(n1==n2)
{
System.out.println("Two numbers are the same");
}else if(n1>n2){
System.out.println("First number is larger");
}else{
System.out.println("Second number is larger");
}
//--------------------------

if(n1>n2)
{ temp = n1+n2;
if (temp>20){
	System.out.println("Total is larger than 20");
}else{
	System.out.println("Total is less than 20");
}
}else{
	temp = n2-n1;
	if (temp>10){
	System.out.println("Difference is larger than 10");
}else{
	System.out.println("Difference is less than 10");
}
}//end if
temp=0;
System.out.println("Run again? enter 1: ");
temp=obj.nextInt(); //if temp=1 while continues.

}//end while

}//end main
}//end class