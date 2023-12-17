import java.util.*;
public class factors3
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("The of factors "+a+" are: ");
for(b=1;b<a;b++)
{
if(a%b==0)
{
c=c+b;
System.out.println(b);
}
}
System.out.println("The sum of factors of "+a+" is "+c);
}
}