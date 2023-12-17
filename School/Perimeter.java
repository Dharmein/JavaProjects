import java.util.Scanner;
public class Perimeter
{
public static double perimeter(double s) 
{
double p = 4 * s;
return p;
}
public static double perimeter(double l, double b) 
{
double p = 2 * (l + b);
return p;
}
public static double perimeter( int a,double r) 
{
double p = 2* (22/7) * r;
return p;
}
public static void main(String args[]) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter side of square: ");
double s = in.nextDouble();
System.out.println("Perimeter of square = " + perimeter(s));
System.out.print("Enter length of rectangle: ");
double l = in.nextDouble();
System.out.print("Enter breadth of rectangle: ");
double b = in.nextDouble();
System.out.println("Perimeter of rectangle = " + perimeter(l, b));
System.out.print("Enter radius of circle: ");
double r = in.nextDouble();
System.out.println("Perimeter of circle = " + perimeter(1, r));
}   
}
