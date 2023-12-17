import java.util.*;
public class operators4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int b=3;
int c=6;
System.out.println("Enter a number");
a=sc.nextInt();
if(a%3==0&&a%6==0)
{
System.out.println("The number is divisible by 3 & 6");
}
else if(a%6==0)
{
System.out.println("The number is divisible by 6");
}
else if(a%3==0)
{
System.out.println("The number is divisible by 3");
}
else
System.out.println("The numberis divisible by niether by 3 nor by 6");
}
}