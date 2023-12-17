import java.util.*;
public class arrays9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int b,c,d=0;
System.out.println("Enter the number you want to find");
b=sc.nextInt();
System.out.println("Enter 5 numbers");
for(c=0;c<5;c++)
a[c]=sc.nextInt();
for(c=0;c<5;c++)
{
if(a[c]==b)
{
System.out.println("The number was found at index position "+c);
d++;
}
}
if(d==0)
System.out.println("The number was not found");
}
}