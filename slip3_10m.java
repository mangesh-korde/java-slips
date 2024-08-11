import java.util.*;
class cities
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);  
  System.out.println("Enter Limit:");
   int n=sc.nextInt();
   String s1[]=new String[n];
  System.out.println("ENter n city names:");
  for(int i=0;i<n;i++)
  {
    s1[i]=sc.next();
  }
  for(int pass=1;pass<n;pass++)
  {
    for(int i=0;i<n-pass;i++)
     {
       if((s1[i].compareTo(s1[i+1]))>0)
       {
         String t=s1[i];
                s1[i]=s1[i+1];
                s1[i+1]=t;
     
       }
       
     }
  }
    System.out.println("Disp Names :");
   for(int i=0;i<n;i++)
  {
    System.out.print(s1[i]+" ");
  }
  }
 
}