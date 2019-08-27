import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      for(int i=0;i<n;i++)
        b[i]=in.nextInt();
     int c[]=new int[n];
      for(int i=0;i<n;i++)
       c[i]=a[i]+b[i];
      for(int i=0;i<n;i++)
      System.out.println(c[i]);
    }
}