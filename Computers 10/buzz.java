import java.util.*;
public class buzz
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter a number");
a=sc.nextInt();
b=a%10;
if(b==7||a%7==0)
System.out.println("The number is a buzz number");
else
System.out.println("The number is not a buzz number");
}
} 