import java.util.*;
public class factors2
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0;
System.out.println("Enter a number");
a=sc.nextInt();
for(b=1;b<a;b++)
{
if(a%b==0)
{
c++;
}
}
System.out.print("The number of factors are "+c);
}
}