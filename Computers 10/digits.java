import java.util.*;
public class digits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e;
System.out.println("Enter a three digit number");
a=sc.nextInt();
b=(int)(a/100);
c=(int)(a%100);
c=(int)(c/10);
d=a%10;
e=(d*100)+(c*10)+b;
System.out.println(e);
}
}