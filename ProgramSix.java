import java.io.*;
class ProgramSix
{
public static void main(String a[])
{
int n=a.length;
if(n==0)
System.out.println("Enter the integer number");
else
{
long num=Integer.parseInt(a[0]);
long t=num;
long l=0;
long g=1,s;
while(num>0)
{
s=num%10;
l=l*10+s;
num=num/10;
}
if(l==t)
System.out.println(a[0]+" is a palindrome ");
else
System.out.println(a[0] +" is not a palindrome ");
}
}
}