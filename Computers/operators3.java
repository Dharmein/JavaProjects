import java.util.*;
public class operators3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a ;
int b;
System.out.println("Enter the first number");
a=sc.nextInt();
System.out.println("Enter the second number");
b=sc.nextInt();
if(a<b)
{
System.out.println("The first number is smaller than the second number");
}
else if(a>b)
{
System.out.println("The first number is greater than the second number");
}
else
System.out.println("The first number is equal to the second number");
}
}