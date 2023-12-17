import java.util.*;
public class advfor5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=1;
int x,y=0;
char d;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter \"f\" to know the the factorial of a numberand Enter \"p\" to check whether the number is a prime number or not");
d=sc.next().charAt(0);
if(d=='f')
{
for(b=1;b<=a;b++)
{
c=c*b;
}
System.out.println(c);
}
else
{
for(x=1;x<=a;x++)
{
if(a%x==0)
{
y++ ;   
System.out.println(x+" is a factor of "+a);
}
}
if(y==2)
{
System.out.println(a+" is a prime number ");
}
else
System.out.println(a+" is not a prime number");
}
}
}