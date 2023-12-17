import java.util.*;
public class simplelogic2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter another number");
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;

System.out.println("a = "+a);
System.out.println("b = "+b);



}
}