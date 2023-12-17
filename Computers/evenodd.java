import java.util.Scanner;
public class evenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int s1=0,s2=0;
System.out.println("Enter 10 numbers");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
if(a[i]%2==0)
s1=s1+a[i];
else
s2=s2+a[i];
}
System.out.println("The sum of all even numbers is: "+s1);
System.out.println("The sum of all odd numbers is: "+s2);
}
}