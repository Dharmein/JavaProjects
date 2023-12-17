import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s="",s1="";
int len,a;
char ch;
System.out.println("Enter a sentence");
s=" "+sc.nextLine();
len=s.length();
for(int i=len-1;i>=0;i--)
{
ch=s.charAt(i);
if(Character.isWhitespace(ch))
{
s1=s1+s.substring(i) ;
s=s.substring(0,i);
}
}
System.out.println(s1);
}
}