class ProgramThirteen
{
public static void main(String arg[])
{
if(arg.length<4)
System.out.println("Please enter 4 integer numbers");
else
{
int a[][]=new int[2][2];
int p=0;
System.out.println("The given array is :");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(arg[p]);
System.out.print(a[i][j]+" ");
p++;
}
System.out.println();
}
int t;
t=a[1][1];
a[1][1]=a[0][0];
a[0][0]=t;
t=a[0][1];
a[0][1]=a[1][0];
a[1][0]=t;
System.out.println("The reverse of the array is :");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
}
