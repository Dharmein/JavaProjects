import java.util.*;
public class minmax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0,d=0;
for(a=1;a<=10;a++)
{
System.out.println("Enter a number");
b=sc.nextInt();
if(b>=c)
{
c=b;
}
if(b<d)
{
d=b;
}
}
System.out.println("The greatest number is "+c);
System.out.println("The smallest number is "+d);
}
}