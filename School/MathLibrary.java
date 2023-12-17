import java.util.*;
public class MathLibrary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c=-5.6,d,e,f,g;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter another number");
b=sc.nextInt();
e=Math.max(a,b);
d=Math.min(a,b);
f=Math.sqrt(a);
g=Math.abs(c);
System.out.println("The highest number is "+e);
System.out.println("The lowest number is "+d);
System.out.println("The square root of the first number is "+f);
System.out.println("The absolute of the -5.6 is "+g);
}
}