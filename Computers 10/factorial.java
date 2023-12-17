import java.util.*;
public class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=1;
System.out.println("Enter a number");
a=sc.nextInt();
for(b=1;b<=a;b++)
{
c=c*b;
}
System.out.println("The factorial of the number is "+c);
}
}