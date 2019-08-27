import java.util.*;
class Main
{
  public static void main(String args[])
  {Scanner in =new Scanner(System.in);
   int n=in.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
     a[i]=in.nextInt();
   int s=0;
   for(int i=0;i<n;i++)
      s+=a[i];
   
   double m=(double)((double)s/(double)n);
   String s1=String.format("%.2f",m);
     System.out.println("The mean of the array is "+s1);
    //type your code
  }
}