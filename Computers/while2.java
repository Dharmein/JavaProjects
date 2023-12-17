import java.util.*;
public class while2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b=1,c=0;
System.out.println("Enter a number");
a=sc.nextInt();
while(b<a)
{
    b++;
if (a%b==0)
{
c++;
}
}
if(c==2)
{
System.out.println(a+" is a prime number");
}
else
System.out.println(a+" is not a prime number");
}
}