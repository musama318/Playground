import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int f=0;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      for(int i=0;i<n;i++)
        b[i]=in.nextInt();
   
      for(int i=0;i<n;i++)
       if(a[i]<b[i])
         f=1;
    if(f==0)
      System.out.println("Compatible");
    else
      System.out.println("Incompatible");
    }
}