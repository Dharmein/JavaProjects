import java.util.*;
public class  advrevision2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c;
System.out.println("Enter the number who's square root you want to find");
a=sc.nextDouble();
System.out.println("Enter the number who's cube root you want to find");
b=sc.nextDouble();
c=Math.sqrt(a)+Math.cbrt(b);
System.out.println("Square root of the first number is "+Math.sqrt(a));
System.out.println("Cube root of the second number is "+Math.cbrt(b));
System.out.println("On adding both the numbers we get "+c);
}
}