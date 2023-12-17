import java.util.*;
public class advfor4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a number");
a=sc.nextInt();
for(b=1;b<=a;b++)
if(a%b==0)
{
System.out.println(b+" is a factor of "+a);
}


}
}