import java.util.*;
public class while1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b=1,c;
System.out.println("Enter a number");
a=sc.nextInt();
c=1;
while(b<a)
{
b++;
 c=c*b;

}
System.out.println(c+" is a factorial of "+a);
}
}