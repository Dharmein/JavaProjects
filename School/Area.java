import java.util.*;
public class Area
{
public static void area(int base,int ht)
{
int x=base*ht;
System.out.println("The area of parallelogram is "+x);
}
public static void area(double d1,double d2)
{
double x=0.5*d1*d2;
System.out.println("The area of rhombus is "+x);
}
public static void area(double a,double b,double h)
{
double x=0.5*(a+b)*h;
System.out.println("The area of trapezium is "+x);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the height and base of the parallelogram");
int base=sc.nextInt();
int ht=sc.nextInt();
System.out.println("Enter the 2 diagonals of the rhombus");
double d1=sc.nextDouble();
double d2=sc.nextDouble();
System.out.println("Enter the parallel sides and the height of the trapezium");
double a=sc.nextDouble();
double b=sc.nextDouble();
double h=sc.nextDouble();
area(base,ht);
area(d1,d2);
area(a,b,h);
}
}