import java.util.*;
public class scanner3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int s;
int t;

System.out.println("Enter speed");
s=sc.nextInt();
System.out.println("Enter time");
t=sc.nextInt();

int d=s*t;
System.out.print("Distance : "+d);
System.out.print("km");
}
}