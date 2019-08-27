import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s1=9,s2=11;
      System.out.print(s1+" "+s2+" ");
      for(int i=3;i<=n;i++)
      {
        int s=s1+s2;
      System.out.print(s+" ");
        int temp=s;
        s1=s2;
        s2=temp;
        
      }
	}
}