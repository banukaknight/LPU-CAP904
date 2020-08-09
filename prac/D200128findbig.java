import java.util.Scanner;

class D200128findbig
{
public static void main (String args[])
{
Scanner scan = new Scanner(System.in);

int temp=1;
while(temp==1){

System.out.println("Enter no 1: ");
int n1 = scan.nextInt();
System.out.println("Enter no 2: ");
int n2 = scan.nextInt();
System.out.println("Enter no 3: ");
int n3 = scan.nextInt();

/*
if((n1>n2)&&(n1>n3)){
temp = n1;
}else if((n3>n1)&&(n3>n2)){
temp = n3;
}else if((n2>n1)&&(n2>n3)){
temp = n2;
}
System.out.println("Largest is " + temp + "\n\n");
*/

temp=0;
if(n1>n2){
	if(n1>n3){temp = n1;}
		else{ temp = n3;}
}else{
		if(n2>n3){
			temp = n2;
	}else{
		temp = n3;
		}
	}
System.out.println("Largest is " + temp + "");

temp=0;
System.out.println("Run again? enter 1: ");
temp=scan.nextInt(); //if temp=1 while continues.


}//end while

}//end main
}//end class