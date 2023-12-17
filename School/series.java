import java.util.*;
public class series
{
public static void series(int x,int n)
{
double b=0;
for(int a=1;a<=n;a++)
{
b=b+Math.pow(x,a);
}
System.out.println("The sum of series is "+b);
}
public static void series(int p)
{
int b;
System.out.println("The series is ");
for(int a=1;a<=p;a++)
{
b=(a*a*a)-1;
System.out.println(b); 
}
}
public static void series()
{
double b=0.0;
for(double a=2.0;a<=10.0;a++)
b=b+(1/a);
System.out.println("The sum of the series is "+b);
}
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter 3 numbers");
int x=sc.nextInt();
int n=sc.nextInt();
int p=sc.nextInt();
series(x,n);
series(p);
series();
}
}