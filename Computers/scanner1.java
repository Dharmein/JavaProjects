import java.util.*;
public class scanner1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String name;
int rollno;
int std;
char div;

System.out.println("Enter your name");
name=sc.next();
System.out.println("Enter you rollno");
rollno=sc.nextInt();
System.out.println("Enter your standard");
std=sc.nextInt();
System.out.println("Enter your division");
div=sc.next().charAt(0);

System.out.print("Name : "+name);
System.out.println("\t\t\t\tRollno : "+rollno);
System.out.print("Standard : "+std);
System.out.println("\t\t\t\tDivision : "+div);
}
}