import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];

      int f=0;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int s=in.nextInt();
   
      for(int i=0;i<n;i++)
       if(s==a[i])
         f=1;
    if(f==0)
      System.out.println(s+" is not present in the array");
    else
      System.out.println(s+" is present in the array");
    }
}