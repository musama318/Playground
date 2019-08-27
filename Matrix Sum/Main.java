import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     int m=in.nextInt();
     int n=in.nextInt();
     int a[][]=new int[m][n];
     for(int i=0;i<m;i++)
       for(int j=0;j<n;j++)
         a[i][j]=in.nextInt();
     int s=0;
     for(int i=0;i<m;i++)
       for(int j=0;j<n;j++)
         s+=a[i][j];
     System.out.println(s);
         // fill your code
	}
}