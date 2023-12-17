import java.util.*;
public class arrays3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int c=0,d=1,f=0,h,g=0;
System.out.println("Enter 5 numbers");
for(int b=0;b<5;b++)
{
a[b]=sc.nextInt();
c=c+a[b];
d=d*a[b];
if(a[b]%2==0)
{
f++;
g=g+a[b];
}
}
System.out.println("sum: "+c);
System.out.println("product: "+d);
System.out.print("Sum of even numbers: ");
System.out.println(g);
}
}