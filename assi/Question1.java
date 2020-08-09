//Q1. Write a program to implement function overriding
/*If subclass (child class) has the same function as declared in the parent class, it is known as function overriding in Java*/

class Parent1{
	void printThis() //print function definition
	{
		System.out.println("Parent1 is accessed");
	}
}//end class ChildClass1

class Child1 extends Parent1{
	void printThis() //print function definition
	{
		System.out.println("Child1 is accessed\n");
	}
}//end class ChildClass1

class Child2 extends Parent1{
	void printThis() //print function definition
	{
		System.out.println("Child2 is accessed\n");
		//use super keyword to invoke function from parent class
		super.printThis(); 
	}
}//end class ChildClass1


class Question1{
	public static void main(String args[])
	{
	//creat objects
	Child1 obj1 = new Child1();
	Child2 obj2 = new Child2();

	//call object-methods
	obj1.printThis();
	obj2.printThis();

	}//end main
}//end class Question1