import java.util.*;
public class minmax
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int a[]=new int[10];
int min,max;
System.out.println("Enter 10 numbers");
for(int i=1;i<10;i++)
a[i]=sc.nextInt();
min=a[0];
max=a[0];
for(int i=1;i<10;i++)
{
if(min>a[i])
min=a[i];
if(max<a[i])
max=a[i];
}
System.out.println("Greatest number "+max);
System.out.println("Smallest number "+min);
}
}