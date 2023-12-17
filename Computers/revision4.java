import java.util.*;
public class revision4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c,d,e,f;
System.out.println("Enter your marks out of 100 in Physics");
a=sc.nextDouble();
System.out.println("Enter your marks out of 100 in Chemistry");
b=sc.nextDouble();
System.out.println("Enter your marks out of 100 in Biology");
c=sc.nextDouble();
d=((a+b+c)/300)*100;
if(d>=90)
{
System.out.println("You got A+");
}
else if(d>=60)
{
System.out.println("You got A");
}
else
System.out.println("Study hard next time");
}
}
