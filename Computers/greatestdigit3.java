import java.util.*;
public class greatestdigit3
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
if(Math.max(a,b)==a&&Math.max(a,c)==a)
System.out.println(a+" is the greatest number");
else if(Math.max(b,a)==b&&Math.max(b,c)==b)
System.out.println(a+" is the greatest number");
else if(Math.max(c,a)==c&&Math.max(c,b)==c)
System.out.println(a+" is the greatest number");
else
{
System.out.print(a+" ");
System.out.print(b+" ");
System.out.print(c+" ");
System.out.print("are equal ");
}
}
}