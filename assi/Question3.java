//3. Write a program to create array of objects of class Circle and print areas of ten circle objects.

import java.lang.Math.*;

class Circle{
	double radius;
	double area;	
	
	Circle(double r){
		radius = r;
		area = radius * radius * Math.PI ;
	}
	
	void getArea(){
		System.out.println("\tarea: " + area);
	}
}//end class Circle

class Question3{
	public static void main(String args[])
	{
		System.out.println("Array of objects program\n");
		
	Circle obj[] = new Circle[10];
	obj[0] = new Circle(10);
	obj[1] = new Circle(1);
	obj[2] = new Circle(20.43);
	obj[3] = new Circle(20.1);
	obj[4] = new Circle(16.1);
	obj[5] = new Circle(70.1);
	obj[6] = new Circle(6.1);
	obj[7] = new Circle(8.1);
	obj[8] = new Circle(9.113);
	obj[9] = new Circle(12.41);
	
	for(int i=0; i<10;i++){
		System.out.print("Circle " + i + " radius " + obj[i].radius);
		obj[i].getArea();
	}
	
	}//end main
}//end class Question3