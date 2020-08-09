import java.util.Scanner;
class D200311Array1
{

public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	
	double marks1[] = new double[5];
	
	for(int i=0;i<marks1.length;i++)
	{
	marks1[i]=(Math.floor(Math.random()*100));
	}
	
	for(double j:marks1){
	System.out.print(j + ", ");
	}
	//----------
	
	System.out.println("\n\nEnter length for next array: ");
	int n=obj.nextInt();
	
	int mark[] = new int[n];
	
	for(int j=0;j<n;j++)
	{
		System.out.println("Enter value at: " + j);
			mark[j]=obj.nextInt();
	}
	
	for(int j=0;j<n;j++)
	{
		System.out.println(mark[j]);
	
	}
	
	
}//main
}//main class