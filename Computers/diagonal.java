import java.util.*;
public class diagonal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double l,b,h,d;
System.out.println("Enter the lenght, breadth and height of the cuboid");
l=sc.nextDouble();
b=sc.nextDouble();
h=sc.nextDouble();
d=Math.sqrt((l*l)+(b*b)+(h*h));
System.out.println("The diagonal of the cuboid is "+d);
}
}