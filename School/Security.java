import java.util.*;
public class Security
{
Scanner sc=new Scanner(System.in);
String n;
int h;
double r,w;
public void get()
{
System.out.println("Enter the name");
n=sc.nextLine();
System.out.println("Enter the hours");
h=sc.nextInt();
System.out.println("Enter the rate");
r=sc.nextDouble();
}
public void calwage()
{
if (h<=40)
w=r*40;
if(h>40&&h<=60)
w=(h-40)*1.5*r+40*r;
if(h>60)
w=(h-60)*2*r+20*1.5*r+40*r;
}
public void display()
{
System.out.println("Name \t Hours \t Wage");
System.out.println(n+" \t "+h+" \t "+w);
}
public static void main(String args[])
{
Security ob=new Security();
ob.get();
ob.calwage();
ob.display();
}
}