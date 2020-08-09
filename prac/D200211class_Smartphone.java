class D200211class_Smartphone
{

int scr_sz;
String brand;
int cam_q;

void dialnum()
{
System.out.println("Call number 123343243");
}

void takepic()
{
System.out.println("Open cam");
}

void printdet()
{
System.out.println("Name: "+ brand);
System.out.println("Camera Quality" + cam_q + " pixels");
System.out.println("Screen size"+ scr_sz + " inches");

}

public static void main(String args[])
{

Smartphone phone1 = new Smartphone();

phone1.scr_sz = 8;
phone1.brand = "Samsung";
phone1.cam_q = 64;

phone1.dialnum();
phone1.takepic();
phone1.printdet();









}//main

}//end class