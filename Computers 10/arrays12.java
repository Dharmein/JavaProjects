import java.util.*;
public class arrays12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int b,c=20,d=0;
System.out.println("Enter 10 numbers");
for(b=0;b<10;b++)
{
a[b]= sc.nextInt();
if (a[b]<c)
{
c=a[b];
d=b;
}
}
System.out.println("The smallest number is "+c+" at index position "+d);
}
}