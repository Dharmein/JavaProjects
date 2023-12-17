import java.util.*;
public class arrays4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[12];
int b,c=1;
System.out.println("Enter 12 numbers");
for(b=0;b<12;b++)
a[b]=sc.nextInt();
System.out.println("The numbers at odd index positions are: ");
for(c=1;c<=12;c=c+2)
System.out.println(a[c]);
}
}