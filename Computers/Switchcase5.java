import java.util.*;
public class Switchcase5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c,d,e;
System.out.println("Enter a number");
a=sc.nextDouble();
b=Math.sqrt(a);
c=Math.cbrt(a);
d=Math.ceil(a);
e=Math.floor(a);
if (a%2==0)
{
System.out.println(b);
}
else
System.out.println(c);
if(a>=0)
{
System.out.println(d);
}
else 
System.out.println(e);
}
}