import java.util.*;
public class simplelogic3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a two digit number");
a=sc.nextInt();
b=a/10;
c=a%10;
System.out.println("The number in the tens place is "+b);
System.out.println("The number in the units place is "+c);


}
}