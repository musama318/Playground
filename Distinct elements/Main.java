import java.util.Scanner;
class Main
{static boolean prs(int el,int a[],int n)
  {int i; 
  for(i=0;i<n;i++)
         if(el==a[i])
           return true;
         return false;
    }
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int f=0;
      int c=0;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
         
      for(int i=0;i<n;i++)
         if(prs(a[i],a,n))
           c=c+1;
      System.out.println(c-1);
   
    }
}