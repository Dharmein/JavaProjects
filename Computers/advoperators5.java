import java.util.*;
public class advoperators5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int b;
char x;
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter another number");
b=sc.nextInt(); 
int d=a+b;
int e=a-b;
int f=a*b;
int g=(a+b)/2;
System.out.println("Enter \'a\' for addition \n Enter \'b\' for subtraction \n Enter \'c\' for multiplication \n Enter \'d\' to find average");
x=sc.next().charAt(0);

if(x=='a')
{
System.out.println(d);
}
else if (x=='b')
{
System.out.println(e);
}
else if (x=='c')
{
System.out.println(f);
}
else if (x=='d')
{
System.out.println(g);
}


} 
}