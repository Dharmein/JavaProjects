import java.util.*;
public class simplelogic4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter a two digit number");
a=sc.nextInt();
b=a/10;
c=a%10;
d=c*10+b;
System.out.print("The reverse of "+a);
System.out.print(" is "+d);


}
}