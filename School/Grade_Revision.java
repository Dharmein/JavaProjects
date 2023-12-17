import java.util.*;
class Grade_Revision
{
String name;
int bas,expn;
double inc,nbas;
Grade_Revision()
{
name="";
bas=0;expn=0;
inc=0.0;nbas=inc+bas;
}
void accept()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter name");
name=in.next();
System.out.println("Enter basic salary");
bas=in.nextInt();
System.out.println("Enter experience");
expn=in.nextInt();
}
void increment()
{
if(expn<=3)
inc=1000+(10.0/100.0*bas);
if(expn>3||expn<=5)
inc=3000+(12.0/100.0*bas);
if(expn>5||expn<=10)
inc=5000+(15.0/100.0*bas);
if(expn>10)
inc=8000+(20.0/100.0*bas);
}
void display()
{
System.out.println("Name-> "+name);
System.out.println("Basic salary-> "+bas);
System.out.println("Experience-> "+expn);
System.out.println("Increment-> "+inc);
System.out.println("New basic salary-> "+(inc+bas));
}
static void main()
{
Grade_Revision ob=new Grade_Revision();
ob.accept();
ob.increment();
ob.display();
}
}
