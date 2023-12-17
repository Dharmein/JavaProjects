import java.util.*;
public class factors
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.print("The of factors "+a+" are: ");
for(b=1;b<a;b++)
{
if(a%b==0)
{
System.out.print(b+" ,");
}
}
}
}