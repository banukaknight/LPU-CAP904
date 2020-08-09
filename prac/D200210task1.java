import java.util.Scanner;

class D200210task1
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter start of range: ");
int no1 = scan.nextInt();
System.out.println("Enter end of range: ");
int no2 = scan.nextInt();

int odd = 0, even = 0;

for(int i=no1; i<=no2; i++){
if(i%2==0){
	even=even+i;
}else{
	odd+=i;
}

}
System.out.println("In the range of " + no1 + " and " + no2);
System.out.println("Odd number total is: " + odd + "\nEven number total is: " + even);


}//main
}//class