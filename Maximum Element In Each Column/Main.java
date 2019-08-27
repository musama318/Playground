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
     for(int i=0;i<m;i++)
     {int max=0;
      for(int j=0;j<n;j++)
         if(max<a[j][i])
           max=a[j][i];
     System.out.println(max);}
         // fill your code
	}
}