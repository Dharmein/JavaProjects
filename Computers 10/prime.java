import java.util.*;
public class prime
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0;
System.out.println("Enter a number");
a=sc.nextInt();
for(b=2;b<a;b++)
{
if(a%b==0)
{
c=c+b;
}
}
if(c==0)
System.out.println(a+" is a prime nume number");
else 
System.out.println(a+" is not a prime number");
}
}