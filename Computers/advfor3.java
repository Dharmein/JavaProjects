import java.util.*;
public class advfor3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0;
System.out.println("Enter a number ");
a=sc.nextInt();
for(b=1;b<=a;b++)
{
if(a%b==0)
{
c++;
System.out.println(b);
}
}
System.out.print("There are "+c);
System.out.print(" number of factors of "+a);
}
}