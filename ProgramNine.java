import java.io.*;
class ProgramNine
{
public static void main(String arg[])
{
try
{
int l=Integer.parseInt(arg[0]);
if(l==0)
System.out.println("The factorial of 0 is 1");
else
{
int f=1;
for(int i=2;i<=l;i++)
{
f=f*i;
}
System.out.println("The factorial of "+l+" is "+f);
}
}
catch(Exception a)
{
System.out.println("enter the number");
}
}
}
