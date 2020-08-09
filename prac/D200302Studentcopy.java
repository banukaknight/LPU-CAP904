class Student
{String name;
int rno;
int age;

Student(String n, int r, int a)
{ name =n;
rno=r;
age=a;}

Student(){}
//when param-constructor is declared, must mention default constructor aswell (it will not be created automatically like in c++)

void display()
{System.out.println("Name: "+name);
System.out.println("Rno: "+rno);
System.out.println("Age: "+age);
}
}//end of class student

class D200302Studentcopy
{
public static void main(String args[])
{
Student s1=new Student("Bond",12,19);
Student s2=new Student(); //this will give error if default constructor is not declared

s2.name=s1.name;
s2.rno=s1.rno;
s2.age=s1.age;
s1.display();
s2.display();

}
}//end of main class
