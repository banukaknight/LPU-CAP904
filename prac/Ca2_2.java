import java.util.Scanner;

class Books
{
String book_name;
String book_author;
int no_of_pages;
int cost;

Books()
{
book_name = "Book name not set";
book_author = "Author not set";
no_of_pages = 0;
cost = 0;
}

Books(String bn, String ba, int bp, int bc)
{
//initialize data members using a parameterized
book_name = bn;
book_author = ba;
no_of_pages = bp;
cost = bc;
}

void print_details()
{
System.out.println("Book Name: " + book_name
+"\nBook Author: " + book_author
+"\nPages in book: " + no_of_pages
+"\nCost of Book: " + cost);
} //end of print function

void set_book(String bn, String ba, int bp, int bc)
{
//initialize data members using a method(member function)
book_name = bn;
book_author = ba;
no_of_pages = bp;
cost = bc;
}


}//end of class books


class Ca2_2
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter name for book1: ");
String bn = scan.nextLine();
System.out.println("Enter author for book1: ");
String ba = scan.nextLine();
System.out.println("Enter pages for book1: ");
int bp = scan.nextInt();
System.out.println("Enter cost for book1: ");
int bc = scan.nextInt();

System.out.println("\n\nInitialized using a method AKA member function");
System.out.println("\nFiction book");
Books fiction = new Books();
fiction.set_book(bn,ba,bp,bc);
fiction.print_details();

System.out.println("\nInitialized using a object of class");
System.out.println("\nNon-Fiction book");
Books non_fiction = new Books();
non_fiction.book_name = "Harry Potter";
non_fiction.book_author = "JK Rolling";
non_fiction.no_of_pages = 342;
non_fiction.cost = 111;
non_fiction.print_details();

System.out.println("\n\nInitialized using a non-parameter constructor with default values");
Books book3 = new Books();
book3.print_details();

System.out.println("\n\nInitialized using a parameterized constructor with given values");
Books book4 = new Books("Sherlock", "Conondile", 232, 422);
book4.print_details();




}//end of main
}//end of class CA2_2