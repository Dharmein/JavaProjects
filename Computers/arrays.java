import java.util.*;
public class arrays
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int a[]=new int[n];
int k=0;
System.out.println("Enter the characters of the array");
for(int i=0;i<n;i++)
a[i]=sc.next().charAt(0);
System.out.println("Enter the character to be searched");
int ns=sc.next().charAt(0);
for(int i=0;i<n;i++)
{
if(ns==a[i])
k=1;
}
if(k==1)
System.out.println("Element found: "+ns);
else 
System.out.println("NO SUCH ELEMENT");
}
}