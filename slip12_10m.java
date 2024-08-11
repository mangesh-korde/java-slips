import java.util.*;
class college
{
 String cname,caddr;
 int cno;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter college appropriate Info...");
   cno=sc.nextInt();
   cname=sc.next();
   caddr=sc.next();
 }
}
class department extends college
{
  void disp()
  {
   System.out.println("College no="+cno);
   System.out.println("College name="+cname);
   System.out.println("College addr="+caddr);
}
}
class demo
{
 public static void main(String arg[])
 {
   department ob=new department();
   ob.accept();
   ob.disp();
 }
}