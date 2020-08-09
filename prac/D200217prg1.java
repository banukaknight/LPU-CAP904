import java.util.Scanner;



class Rectangle
{
	int length =10;
	int width =20;
	
	void calcArea()
	{
		System.out.println("Area is: "+ length*width);
	}
	
	void getval(int l,int width)
	{
		length = l;
		this.width = width;
	}
	
	Rectangle()
	{
		length =3;
	 width =6;
	}//default constructor
	
	Rectangle(int length, int w)
	{
		this.length =length;
	 width =w;
	}//parameterized constructor
	
	
	
}//rect


class D200217prg1
{
public static void main(String args[])
{
System.out.println("In default Rectangle: ");
//default constructor called if available
Rectangle x1 = new Rectangle(); 
x1.calcArea();

Scanner scan = new Scanner(System.in);
System.out.print("Enter length & width: ");

Rectangle x2 = new Rectangle();
x2.length = scan.nextInt();
x2.width = scan.nextInt();
x2.calcArea();

System.out.println("Using method- function");
Rectangle x3 = new Rectangle();
x3.getval(8,5);
x3.calcArea();

System.out.println("Parametersied cons ");
Rectangle x4 = new Rectangle(10,3);
x4.calcArea();






}//main
}//class