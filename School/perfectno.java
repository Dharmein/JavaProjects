import java.util.*;
public class perfectno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c=0,d=0;
System.out.println("Enter a number");
a=sc.nextDouble();
for(b=0;b<=a;b++)
{
if(a%b==0 && b!=a)
{
System.out.print("The factors of "+a);
System.out.println(" is "+b); 
d=d+b;
}
}
if (d==a)
System.out.println("The number is perfect");
else 
System.out.println("The number is not perfect");
}
}