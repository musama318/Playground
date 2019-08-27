import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int d=5;
      int s=6;
      for(int i=0;i<n;i++)
      {
      System.out.print(s+" ");
        s=s+d;
        d=d+5;
      }
	}
}