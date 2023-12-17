import java.util.*;
public class arrays
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[7];
int b,c=0,d,e,f;
System.out.println("Enter 7 numbers");
for(b=1;b<=6;b++)
{
 c++;
 a[c]= sc.nextInt();
if (a[c]%2==0)
System.out.println(a[c]+" is Even");
else
System.out.println(a[c]+" is Odd");
}
}
}