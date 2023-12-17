import java.util.*;
public class arrays8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int b,c,d=0;
System.out.println("Enter the number to be found");
c=sc.nextInt();
System.out.println("Enter 10 numbers");
for(b=0;b<10;b++)
{
a[b]= sc.nextInt();
if (a[b]==c)
d=b;
}
if (a[d]==c)
System.out.println("The number is at index position "+d);
else
System.out.println("The number was not found");
}
}