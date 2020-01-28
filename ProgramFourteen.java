import java.util.*;
class Box
{
double w,h,l;
void intialize(double w,double h,double l)
{
this.w=w;
this.h=h;
this.l=l;
}
double calucalute()
{
return w*h*l;
}
}
class ProgramFourteen
{
public static void main(String arg[])
{
Box b=new Box();
Scanner s=new Scanner(System.in);
double w,h,l;
w=s.nextDouble();
h=s.nextDouble();
l=s.nextDouble();
b.intialize(w,h,l);
System.out.println("volume is "+b.calucalute());
}
}
