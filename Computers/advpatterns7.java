public class advpatterns7
{
public static void main(String args[])
{
int a,b,z;
for(a=1;a<=6;a++)
{
for(b=1;b<=a;b++)
{
if(b>3)
{z=b-3;
System.out.print(z);}
else
System.out.print(b);
}
System.out.println();
}
}
}