public class pattern1
{
public static void main(String args[])
{
int a,b,c,d=1;
for(a=1;a<=5;a++)
{
c=d;
for(b=1;b<=a;b++)
{
System.out.print(c+" ");
c=c+2;
}
d=d+2;
System.out.println();
}
}
}