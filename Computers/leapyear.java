import java.util.*;
public class leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter the year");
a=sc.nextInt();
if(a%4==0)
{
System.out.println("It is a leap year");
}
else

System.out.println("It is not a leap year");
}
}