import java.util.Scanner;
class D200127Myp4_terneryOp{

public static void main(String args[]){
Scanner inp = new Scanner(System.in);

System.out.println("Enter age : ");

byte age = inp.nextByte();

String output = (age>=18) ? "Eligable to vote." : "Will be able to vote in " + (byte)(18-age) + " years";

System.out.println(output);


}
}