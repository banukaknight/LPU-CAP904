class Student
{
int rno;
String name;
static String col_name="Lovely Prof Uni";

void getData(int r, String n)
{
rno=r;
name=n;
}

void displayD()
{System.out.println("Name: " + name);
System.out.println("RollNo: " + rno);
System.out.println("College: " + col_name);
}
}//end class student

class D200303staticStud
{
public static void main(String args[])
{
Student s1 = new Student();
s1.getData(1,"Rohan");
s1.displayD();

Student s2=new Student();
s2.getData(1,"Brown");
s2.displayD();

}//main func
}//main class
