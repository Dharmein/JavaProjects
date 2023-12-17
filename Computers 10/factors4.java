import java.util.*;
public class factors4
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=1;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("The of factors "+a+" are: ");
for(b=1;b<a;b++)
{
if(a%b==0)
{
System.out.println(b);
c=c*b;
}
}
System.out.println("The product of factors are "+c);
}
}