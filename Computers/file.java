import java.util.*;
public class file
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,ext,name,path;
int len,a,b;
System.out.println("Enter the full path");
s=sc.nextLine();
a=s.lastIndexOf('.');
b=s.lastIndexOf('\\');
ext=s.substring(a);
name=s.substring(b+1,a);
path=s.substring(0,b);
System.out.println("Extension: "+ext);
System.out.println("File name: "+name);
System.out.println("Path: "+path);
}
}