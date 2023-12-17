import java.util.*;
public class forloop8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
String c;
System.out.println("Enter your name");
c=sc.next();
System.out.println("How many times do you want to print your name");
a=sc.nextInt();
for(b=1;b<=a;b++)
{
System.out.println(c);
}

}
}