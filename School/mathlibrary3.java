import java.util.*;
public class mathlibrary3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,b,c,d,e;
System.out.println("Enter a number");
a=sc.nextDouble();
b=Math.abs(a);
c=Math.sqrt(a);
d=Math.pow(a,3);
e=Math.random();
System.out.println("Absolute : "+b);
System.out.println("Square root : "+c);
System.out.println("Cube : "+d);
System.out.println("Random no. : "+e);
}
}

