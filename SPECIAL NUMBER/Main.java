import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int n=in.nextInt();
      int i;
      for(i=m;i<=n;i++)
      {
        int temp=i;
        int sum=0;
        int prod=1;
        int msum;
        //System.out.println(i);
      while(temp!=0)
      {
        sum+=(temp%10);
        prod*=(temp%10);
        temp=temp/10;
      }
        msum=sum+prod;
        if(msum==i)
          System.out.println(i);
      }
    }
}