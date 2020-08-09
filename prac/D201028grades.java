import java.util.Scanner;
class D201028grades
{
public static void main(String args[])
{
int s1,s2,s3,s4,s5,avg;
Scanner scan = new Scanner(System.in);

System.out.println("Enter 5 marks :");
s1 = scan.nextInt();
s2 = scan.nextInt();
s3 = scan.nextInt();
s4 = scan.nextInt();
s5 = scan.nextInt();

avg = (s1+s2+s3+s4+s5)/5;
String grade;
if(avg>100){grade = "Wrong inputs";}
else if(avg>=81){grade = "Distinction";}
else if(avg>=61){grade = "First CLass";}
else if(avg>=51){grade = "Second CLass";}
else if(avg>=35){grade = "Third class";}
else if(avg>=0){grade = "Fail";}
else{grade = "Wrong inputs";}


System.out.println("Grade is: " + grade);


}//end main
}//end class