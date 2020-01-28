import java.io.*;
class ProgramTweleve
{
public static void main(String arg[])
{
if(arg.length<=8)
System.out.println("Please enter 9 integer numbers");
else
{
int max=Integer.parseInt(arg[0]);
int l;
for(int i=0;i<=8;i++)
{
if(i%3==0)
System.out.println();
System.out.print(arg[i]+" ");
}
System.out.println();
for(int i=1;i<=8;i++)
{
l=Integer.parseInt(arg[i]);
if(l>max)
max=l;
}
System.out.println("The biggest number in the given array is "+max);
}
}
}
