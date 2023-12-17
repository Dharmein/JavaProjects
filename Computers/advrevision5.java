import java.util.*;
public class advrevision5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,h;
System.out.println("Enter the length of the hand of the right angle of the triangle");
h=sc.nextDouble();
System.out.println("Enter the length of the  other hand of the right angle of the triangle");
b=sc.nextDouble();
a=0.5*b*h;
System.out.println("The area of the triangle is "+a);
}
}