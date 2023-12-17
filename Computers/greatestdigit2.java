import java.util.*;
public class greatestdigit2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter another number");
b=sc.nextInt();
System.out.println("Enter another number");
c=sc.nextInt();
if(a>b&&a>c)
System.out.println(a+" is the greatest number");
else if(b>a&&b>c)
System.out.println(b+" is the greatest number");
else if(c>a&&c>b)
System.out.println(c+" is the greatest number");
else
{
System.out.print(a+" ");
System.out.print(b+" ");
System.out.print(c+" ");
System.out.print("are equal ");
}
}
}