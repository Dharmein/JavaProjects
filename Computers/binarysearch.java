import java.util.*;
public class binarysearch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int len,k=0,lb=0,ub,p=0,n;
System.out.println("Enter the length of the array");
len=sc.nextInt();
ub=len-1;
int a[]=new int[len];
System.out.println("Enter "+len+" numbers");
for(int i=0;i<len;i++)
a[i]=sc.nextInt();
System.out.println("Enter the number to be searched");
n=sc.nextInt();
while(lb<=ub)
{
p=(ub+lb)/2;
if(n==a[p])
{
k=1;
break;
}
if(n<a[p])
ub=p-1;
if(n>a[p])
lb=p+1;
}
if(k==1)
System.out.println("ELement found at "+p);
else
System.out.println("NO SUCH ELEMENT");
}
}