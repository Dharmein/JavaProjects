import java.util.*;
public class advoperators3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int b;
System.out.println("Enter the number of boys in the  class"); 
a=sc.nextInt();
System.out.println("Enter the number of girls in the  class");
b=sc.nextInt();
int c=a+b;
double d=a*100/c;
double e=b*100/c;
System.out.println("The percentage of boys in the class : "+d); 
System.out.println("The percentage of girls in the class : "+e); 

}
}