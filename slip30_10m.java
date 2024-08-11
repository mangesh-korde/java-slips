import java.util.*;
class person
{
  String s,p;
  int a; 
 void accept(String s,int a,String p)
  {
   this.s=s;
   this.a=a;
   this.p=p;
  }
 void disp()
 {
  System.out.printf("\n%s\t%d\t%s",s,a,p);
 }
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
   person ob[]=new person[5];
   for(int i=0;i<5;i++)
   {
    ob[i]=new person();
   System.out.println("Enter (name,adhar no,pan no)Info:");
    String s=sc.next();
    int a=sc.nextInt();
    String p=sc.next();
    ob[i].accept(s,a,p);
   } 
  System.out.println("Disp Info:");
  for(int i=0;i<5;i++)
  {
   ob[i].disp();
  }
  }
}