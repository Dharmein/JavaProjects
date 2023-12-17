import java.util.*;
public class array2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,len;
System.out.println("Enter the length of the array");
len=sc.nextInt();
char ch[]=new char[len];
System.out.println("Enter the elements of the array");
for(int i=0;i<len;i++)
{
ch[i]=sc.next().charAt(0);
sum=sum+(int)ch[i];
ch[i]=Character.toUpperCase(ch[i]);
}
System.out.println("The sum of ASCII values of the character is "+sum);
for(int i=0;i<len;i++)
System.out.println(ch[i]);
}
}