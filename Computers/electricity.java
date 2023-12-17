import java.util.*;
public class electricity
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,unit;
String name;
double price=0;
System.out.println("Enter your name");
name=sc.next();
System.out.println("Enter your consumer number");
num=sc.nextInt();
System.out.println("Enter the units consumed");
unit=sc.nextInt();
if(unit<100)
price=unit *5.5;
else if(unit<300)
price=unit *6.5;
else if(unit<600)
price=unit *7.5;
else if(unit>=600)
price=unit *8.5;
System.out.println("Money Recieipt");
System.out.println("Consumer's number: "+num);
System.out.println("Consumer's name: "+name);
System.out.println("Units consumed: "+unit);
System.out.println("Total price to be paid: "+price);
}
}