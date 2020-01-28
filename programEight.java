import java.io.*;
class ProgramEight
{
public static void main(String a[])
{
if(a.length==0)
System.out.println(" please enter the month in numbers" );
else
{
int l=Integer.parseInt(a[0]);
switch(l)
{
case 1:
System.out.println("Janvary");
break;
case 2:
System.out.println("Febuvary");
break;
case 3:
System.out.println("March");
break;
case 4:
System.out.println("April");
break;
case 5:
System.out.println("may");
break;
case 6:
System.out.println("june");
break;
case 7:
System.out.println("July");
break;
case 8:
System.out.println("August");
break;
case 9:
System.out.println("september");
break;
case 10:
System.out.println("october");
break;
case 11:
System.out.println("November");
break;
case 12:
System.out.println("December");
break;
default:
System.out.println("In valid");
break;
}
}
}
}
