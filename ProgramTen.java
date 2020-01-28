import java.io.*;
class ProgramTen
{
public static void main(String arg[])
{
try
{
int l=Integer.parseInt(arg[0]);
for(int i=0;i<l;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
catch(Exception a)
{
System.out.println("please enter a integer");
}
}
}
