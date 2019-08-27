import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=5,a1;
      int d=11;
      int o=2;
      System.out.print(s+" ");
      for(int i=0;i<n-1;i++)
      {
        a1=s+(11*((i*2)+1));
        s=a1;
      System.out.print(a1+" ");
   
      }
	}
}