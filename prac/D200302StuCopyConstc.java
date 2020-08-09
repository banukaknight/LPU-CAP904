class Student
{private String name;
private int rno;
 int age;

Student(String n, int r, int a)
{ name =n;
rno=r;
age=a;}

Student(){}
//when param-constructor is declared, must mention default constructor aswell (it will not be created automatically like in c++)

Student(Student cc){
	name=cc.name;
	rno=cc.rno;
	age=cc.age;
}//end copy cons

void display()
{System.out.println("Name: "+name);
System.out.println("Rno: "+rno);
System.out.println("Age: "+age);
}
}//end of class student

class D200302StuCopyConstc
{
public static void main(String args[])
{
Student s1=new Student("Bond",12,19);
//Student s2=new Student(); //this will give error if default constructor is not declared
/*
s2.name=s1.name;
s2.rno=s1.rno;
s2.age=s1.age;
*/ 
//cannot access becos they are private

Student s2=s1;  // create copy of reference variable.
// changes made to one object will be reflected in the other as they refer to same memory location.
Student s3 = new Student(s1);


s2.age=99; 

s1.display();
s2.display();


s3.display();
}
}//end of main class
