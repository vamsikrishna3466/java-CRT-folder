import java.io.*;
class ProgramFour
{
public static void main(String a[])
{
int num=Integer.parseInt(a[0]);
if(num>0)
System.out.println(num+" is a positive number");
else if(num<0)
System.out.println(num+" is a negative number");
else
System.out.println(num+" is neither positive nor negative");
}
}