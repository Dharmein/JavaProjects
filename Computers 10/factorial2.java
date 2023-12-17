import java.util.*;
public class factorial2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d=0,e=1;
System.out.println("Enter a number");
a=sc.nextInt();
while (a>0)
{
c=a%10;
a=a/10;
for(b=1;b<c;b++)
{
e=e*b;
System.out.println(e);
}
d=d+e;
}
System.out.println(d);
if(a==d)
System.out.println("The number is a special number");
else
System.out.println("The number is not a special number");
}
}