import java.util.*;
public class arrays5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[20];
int b,c,d;
System.out.println("Enter the temperature of last 20 days in farenheit");
for(b=0;b<20;b++)
{
a[b]=sc.nextInt();
a[b]=(a[b]-32)/(9/5);
}
System.out.println("The temperatures in celsius: ");
for(c=0;c<20;c++)
System.out.println(a[c]);
}
}