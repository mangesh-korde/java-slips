import java.util.*;
class continent
{
  String con;
  Scanner sc=new Scanner(System.in);
  void acceptc()
  {
    
    System.out.println("Enter Continent Name:");
    con=sc.next();
  }
}
 class country extends continent
{
  String c;
  void accept()
  {
    System.out.println("Enter Country Name:");
    c=sc.next();
  }
}
class state extends country
{
  String s;
  void accepts()
  {
    System.out.println("Enter state Name:");
    s=sc.next();
  }
 void disp()
 {
   System.out.println("Continent name="+con);
   System.out.println("Counrty name="+c);
   System.out.println("State name="+s);
 }
}
class demo
{
 public static void main(String arg[])
 {
   state ob=new state();
    ob.acceptc();
    ob.accept();
    ob.accepts();
   ob.disp();
     
 }
}