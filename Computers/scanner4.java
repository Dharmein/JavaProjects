import java.util.*;
public class scanner4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m;
int s;
int e;

System.out.println("Enter the marks in maths");
m=sc.nextInt();
System.out.println("Enter the marks in science");
s=sc.nextInt();
System.out.println("Enter the marks in englih");
e=sc.nextInt();
int p=(m+s+e)*100/300;

System.out.println("Maths  \t\t"+m);
System.out.println("sceince\t\t"+s);
System.out.println("English\t\t"+e);
System.out.println("Percentage : "+p);
}
}