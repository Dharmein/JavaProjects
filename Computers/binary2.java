import java.util.*;
public class binary2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={5,7,9,12,15,25,30,45,89,98};
int k=0,ub=9,lb=0,p=0,ns;
System.out.println("Enter the number to be searched");
ns=sc.nextInt();
for(int i=0;ub>=lb;i++)
{
p=(ub+lb)/2;
if(a[p]==ns)
{
k=1;
break;
}
if(a[p]>ns)
ub=p-1;
if(a[p]<ns)
lb=p+1;
}
if(k==1)
System.out.println("The number "+ns+" is found at "+p);
else
System.out.println("Search element not found");
}
}