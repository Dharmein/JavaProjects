import java.util.*;
public class perfect
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,fac,num2=0;
System.out.println("Enter a number");
num=sc.nextInt();
for(fac=1;fac<num;fac++)
{
if(num%fac==0)
num2=num2+fac;
}
if(num2==num)
System.out.println("It is a perfect number");
else
System.out.println("It is not a perfect number");
}
}