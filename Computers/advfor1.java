import java.util.*;
public class advfor1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a number");
a=sc.nextInt();
c=1;
for(b=1;b<=a;b++)
{
c=c*b;

}
System.out.println(c+" is a factorial of "+a);
}
}