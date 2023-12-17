import java.util.*;
public class Volume
{
public static double volume(double r)
{
double v=(4/3)*(22/7)*r*r*r;
return v;
}
public static double volume(double r,double h)
{
double v=(22/7)*r*r*h;
return v;
}
public static double volume(double l,double b,double h)
{
double v=l*b*h;
return v;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius ");
double r=sc.nextDouble();
System.out.println("Enter the base ");
double b=sc.nextDouble();
System.out.println("Enter the height ");
double h=sc.nextDouble();
System.out.println("Enter the length ");
double l=sc.nextDouble();
volume(r);
volume(r,h);
volume(l,b,h);
double a=volume(r);
double c=volume(r,h);
double d=volume(l,b,h);
System.out.println("The volume of sphere is "+a);
System.out.println("The volume of cylinder is "+c);
System.out.println("The volume of cuboid is "+d);
}
}