import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=4;
      int d=1;
      for(int i=0;i<n;i++)
      {
      System.out.print(s+" ");
        s+=(d*d);
        d++;
      }
	}
}