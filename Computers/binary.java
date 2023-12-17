import java.util.*;
public class binary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int ub=9,lb=0,p=0,k=0,ns,b;
System.out.println("Enter ten numbers");
for(int i=0;i<10;i++)
a[i]=sc.nextInt();
System.out.println("Enter a number to be searched");
ns=sc.nextInt();
for(int i=0;ub>=lb;i++)
{
p=(ub+lb)/2;
b=a[p];
if(b>ns)
ub=p-1;
if(b<ns)
lb=p+1;
if(b==ns)
{
k=1;
break;
}
}
if(k==1)
System.out.println("The number "+ns+" is found at index "+p);
else
System.out.println("Search failed");
}
}