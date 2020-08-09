import java.util.Scanner;
class D200311Array2staticFunc
{


public static void main(String args[])
{
	short marks1[] = new short[10];
	
	for(int i=0;i<marks1.length;i++)
	{
	marks1[i]=(short)(Math.floor(Math.random()*100));
	}
	
	// in for loop use data type of array (can be int, double, string, float... so on)
		for(short j:marks1){
	System.out.print(j + ", ");
	}
	
	//----------Find smallest:
		minNum(marks1);
	
}//main

static void minNum(short arr[])
{ //function to find smallest num
	short m=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(m>arr[i]){m=arr[i];}
	}
	System.out.println("\nSmallest number is: " + m);
}

}//main class