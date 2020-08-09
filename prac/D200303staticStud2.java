import java.util.Scanner;

class Student
{
static int rno=1190000;
String name;
static String col_name="Lovely Prof Uni";
//int x;
static int counter =0;

static void change()
{
	col_name="LPU";
	//System.out.println("Name: " + name); //will give error
}//static function can only change static variables

Student(String nm)
{
	name=nm;
	counter++;
}

void setData(int yy)
{
	rno=yy;
}

void displayD()
{System.out.println("Name: " + name);
System.out.println("RollNo: " + (rno+counter));
System.out.println("College: " + col_name);
}
}//end class student

class D200303staticStud2
{
public static void main(String args[])
{
	
	Scanner scan=new Scanner(System.in);
	int a[]=new int[2];
	
	Student sArr[] = new Student[2];
	String stName;
	
	/*
		for(int i=0;i<1;i++)
	{
		System.out.println("Enter name: ");
		stName = scan.nextLine();
		//sArr[1].getData(1,stName);
		
		//sArr[i].displayD();
	}
	
	*/
	
Student s1 = new Student("Rohan");
s1.displayD();

Student s2=new Student("Hello");
s2.displayD();

Student s3=new Student("Mason");
s3.displayD();

System.out.println ("\n------------");
s1.setData(2100000);
s2.change();

s1.displayD();
s2.displayD();
s3.displayD();

System.out.println ("\nnumber of obj: " + s1.counter);


}//main func
}//main class
