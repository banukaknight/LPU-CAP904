import java.util.Scanner;

class Ca1_1
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
char veh;
int tin, tout, times, charge=0;


System.out.println("Enter symbol for type of vehicle : \nFor Truch = T\nFor Bus = B\nFor Car = C\nFor Cycle = Y\nFor MotorBile = M\nFor Scooter = S");
veh = scan.next().charAt(0);

System.out.println("Enter time vehicle entered park:");
tin = scan.nextInt();
System.out.println("Enter time vehicle EXIT park:");
tout = scan.nextInt();
times = tout - tin;

if(times==1)
{
	if((veh=='T')||(veh=='B'))
	{
		charge = 20;
	}else if(veh=='C')
	{
		charge = 10;
	}else if((veh=='Y')||(veh=='M')||(veh=='S'))
	{
		charge = 5;
	}else{
	System.out.println("Vehicle entered is not valid");	
	}
}else if(times>1){
	if((veh=='T')||(veh=='B'))
	{
		charge = 20 + (times-1)*30;
	}else if(veh=='C')
	{
		charge = 10+ (times-1)*20;
	}else if((veh=='Y')||(veh=='M')||(veh=='S'))
	{
		charge = 5+ (times-1)*10;
	}else{
	System.out.println("Vehicle entered is not valid");	
	}
}else{
System.out.println("Time entered is not valid");	
} //end if-else


if(charge != 0){
System.out.println("You're charged with " + charge + " rupees for staying " + times + " hours in the car park");	
}else{
	System.out.println("Data entered is not valid");	
}// end last ifstatement

}//end main
}//end class