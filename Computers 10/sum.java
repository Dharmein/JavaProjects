import java.util.*;
public class sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,c,d=0;
System.out.println("Enter a number");
a=sc.nextInt();
while (a>0)
{
c=a%10;
a=a/10;
d=d+c;
}
System.out.println(d);
}
}