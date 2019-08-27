import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      double s=0.5;
      double d=1.0;
      for(int i=0;i<n;i++)
      {
      System.out.print(s+" ");
        s=(float)s+d;
        d=d*3;

      }
	}
}