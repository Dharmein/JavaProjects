import java.util.*;
public class ifladder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter your marks");
a=sc.nextInt();
if(a<120)
{
System.out.println("fail");
}
if(a>=120&&a<140)
{
System.out.println("pass");
}
if(a>=140&&a<160)
{
System.out.println("B+");
}
if(a>=160&&a<180)
{
System.out.println("A");
}
if(a>=180)
{
System.out.println("A+");
}
}
}