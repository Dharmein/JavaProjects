public class fibonacci
{
public static void main(String args[])
{
int a,b=0,c=1,d=0;
for(a=1;a<=10;a++)
{
System.out.println(d);
d=a+b;
b=c;
c=d;
}
}
}