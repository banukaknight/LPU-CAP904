/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/

class Member{
	String name;
	int age;
	long phoneNo;
	String address;
	int salary;
	
	void printSalary(){
		System.out.println("Salary is : " + salary);
	}//end printSalary
	
	void setMember(String name, int age, long phoneNo, String address,	int salary){
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}//end setMember
	
	void getMember(){
		System.out.println("\nName : " + name);
		System.out.println("Age : " + age);
		System.out.println("Phone No : " + phoneNo);
		System.out.println("Address : " + address);
		System.out.println("Salary : " + salary);
	}//end getMember
	
}//end Member

class Employee extends Member{
	String specialization;
}//end Employee

class Manager extends Member{
	String department;
}//end Employee

class Question2{
public static void main(String args[])
{
System.out.println("\nAccessing Employee class: ");
Employee emp1 = new Employee();
emp1.specialization = "Tactical Glock 34";
emp1.setMember("John Wick", 35, 112341243, "Delhi", 35000);
emp1.getMember();

System.out.println("\n\nAccessing Manager class: ");
Manager mng1 = new Manager();
mng1.department = "M60";
mng1.setMember("Rambo", 42, 172345432, "Mumbai", 76000);
mng1.getMember();

System.out.println("\nCalling printSalary methods: ");
emp1.printSalary();
mng1.printSalary();

}//end main
}//end class Question2