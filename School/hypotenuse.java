import java.util.*;
public class hypotenuse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c;
System.out.println("Enter the base of the triangle");
a=sc.nextDouble();
System.out.println("Enter the height of the triangle");
b=sc.nextDouble();
c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
System.out.println("hypotenuse : "+c);
}
}