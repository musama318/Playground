import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      double s=95.0;
      double d=20.5;
      for(int i=0;i<n;i++)
      {
      System.out.print(s+" ");
        s=s+d;
        d=d+2.0;
      }
      
	}
}