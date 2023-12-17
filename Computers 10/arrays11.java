import java.util.*;
public class arrays11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int b,c=0,d=1;
System.out.println("Enter 10 numbers");
for(b=0;b<10;b++)
{
a[b]= sc.nextInt();
if (a[b]>c)
c=a[b];
}
System.out.println("The largest number is "+c);
for(b=1;b<=c;b++)
d=d*b;
System.out.println("The factorial of the number is "+d);
}
}