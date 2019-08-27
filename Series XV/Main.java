import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=3,s=8,inc=2,t;
      System.out.print("3 8 ");

      for(int i=3;i<=n;i++)
      {
       t=f+s+inc;
        inc++;
        System.out.print(t+" ");
        f=s;
        s=t;
        

      }
	}
}