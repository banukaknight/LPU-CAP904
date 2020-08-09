import java.util.Scanner;

class Account
{
	String name;
	long acc_no;
	double balance;
String acType;

Account(String name,long acc_no,double balance,String acType)
{
	this.name = name;
	this.acc_no = acc_no;
	this.balance = balance;
	this.acType = acType;
}

void check_bal(long acc_no, String name)
{
	if(acc_no==this.acc_no)
	{
		System.out.println("\nBalance for account no: " + acc_no + "\nis " + balance); 
		}
		else{System.out.println("Accont number mismatch");}
}

void deposit(double amount)
{
	balance=balance+amount;
	System.out.println("\nNew Balance " + balance);
}

void withdraw(double amount)
{
	if(balance-amount<1500)
	{
		System.out.println("Unable to make the withdrawal as minumal balance in account must be over 1500");
		System.out.println("Maximum withdrawal amount atm is: " + (int)(balance-1500));

	}
	else{
		balance=balance-amount;
		System.out.println("\nNew Balance " + balance);
	}
	
}


}//account class

class D200217Bank
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

Account ac1 = new Account("John", 231234, 1900.12, "Current");
Account ac2 = new Account("Jack", 231224, 1200.12, "Savings");
//Account ac3 = new Account();
//calling default constructor will give error since it doesnt exisit.

Account ac[5];

char inp;
do{

System.out.println("Enter \n\tw for withdrawal \n\td for deposit \n\tb for check balance\n\te for EXIT");
 inp = scan.next().charAt(0);
double amount;
switch(inp)
{
	case 'w':
	System.out.println("Enter amount to withdraw: "); 
		 amount = scan.nextDouble();
	ac1.withdraw(amount);
	break;
	
	case 'd':
	System.out.println("Enter amount to deposit: "); 
		 amount = scan.nextDouble();
		ac1.deposit(amount);
	break;
	
	case 'b':
	ac1.check_bal(231234, "John");
	break;
	
	default:
	System.out.println("Error in input"); 
	break;
	
}//end switch

}while(inp != 'e');

}//main
}//class bank