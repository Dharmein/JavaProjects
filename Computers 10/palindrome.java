import java.util.*;
public class palindrome
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
d=d*10 +c;
}
System.out.println("The reverse number is "+d);
if(d==a)
System.out.println("It is a palindrome number");
else
System.out.println("It is not a palindrome number");
}
}