import java.util.*;
public class arrays10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int d[]=new int[5];
int e[]=new int[5];
int b,c=0;
System.out.println("Enter 10 numbers");
for(b=0;b<10;b++)
a[b]= sc.nextInt();
c=b/2;
System.out.println("The first array is: ");
for(b=0;b<c;b++)
System.out.println(a[b]);
System.out.println("The secound array is: ");
for(b=c;b<10;b++)
System.out.println(a[b]);
}
}