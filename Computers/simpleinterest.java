import java.util.*;
public class simpleinterest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e;
System.out.println("Enter the principal");
a=sc.nextInt();
System.out.println("Enter the rate ");
b=sc.nextInt();
System.out.println("Enter the time ");
c=sc.nextInt();
d=(a*b*c)/100;
e=a+d;
System.out.println("Simple interest = "+d);
System.out.println("Amount  = "+e);
} 
}