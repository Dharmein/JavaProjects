import java.util.*;
public class prac
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
int l=0,w=0,len;
char ch;
System.out.println("Enter a sentence");
s=sc.nextLine();
s=" "+s;
len=s.length();
for(int i=0;i<len;i++)
{
ch=s.charAt(i);
if(Character.isLetter(ch))
l++;
else if(Character.isWhitespace(ch))
w++;
}
System.out.println("The number of letters in the sentence are "+l);
System.out.println("The number of words in the sentence are "+w);
}
}