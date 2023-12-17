import java.util.*;
public class armstrong 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d=0;
System.out.println("Enter a number");
a=sc.nextInt();
b=a;
while (b>0)
{
c=b%10;
b=b/10;
d=d+c*c*c;
}
System.out.println("The sum of cubes of the number is "+d);
if(d==a)
System.out.println("It is an armstrong number");
else
System.out.println("It is not an armstrong number number");
}
}