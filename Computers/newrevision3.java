import java.util.*;
public class newrevision3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e;
System.out.println("Write a three digit number which you want to reverse");
a=sc.nextInt();
b=a/100;
c=(a-(b*100))/10;
d=a-(b*100)-(c*10);
e=(d*100)+(c*10)+b;
System.out.println(e);
}
}