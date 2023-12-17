import java.util.*;
public class Student
{
String name;
int mm,scm,comp;
Student(String n,int m,int sc,int cta)
{
name=n;
mm=m;scm=sc;comp=cta;
}
String check()
{
double avg=0.0;
String course="";
avg=mm+scm+comp/3.0;
if(mm>=90 && scm>=90 && comp>=90)
course="Eligible for Science with Computer Applications";
else if(avg>=90)
course="Eligible for Bio-Science";
if(avg>=80 && avg<=90)
course="Eligible for Science With Hindi";
return course;
}
void display()
{
String eligibility=check();
System.out.println("Eligible for: "+eligibility);
}
static void main()
{
Scanner in = new Scanner(System.in);
System.out.print("Enter Name: ");
String n = in.nextLine();
System.out.print("Enter Marks in Maths: ");
int mm = in.nextInt();
System.out.print("Enter Marks in Science: ");
int scm = in.nextInt();
System.out.print("Enter Marks in Computer: ");
int comp = in.nextInt();
Student obj = new Student(n, mm, scm, comp);
obj.check();
obj.display();
}
}
