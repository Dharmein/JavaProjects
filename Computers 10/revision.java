import java.util.*;
public class revision
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
char p;
System.out.println("Enter the value of the first number");
a=sc.nextInt();
System.out.println("Enter the value of the secound number");
b=sc.nextInt();
System.out.println("Enter a for addition and b for subtraction");
p=sc.next().charAt(0);
if (p=='a')
{
c=a+b;
System.out.println(c);
}
else if(p=='b')
{
c=a-b;
System.out.println(c);
}
else 
{
System.out.println("Wrong input");
}
}
}