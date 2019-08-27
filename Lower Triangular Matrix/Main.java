import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int a[][]=new int[n][n];
     for(int i=0;i<n;i++)
       for(int j=0;j<n;j++)
         a[i][j]=in.nextInt();
    
     for (int i = 0; i < n ; i++) 
            for (int j = i + 1; j < n; j++) 
                if (a[i][j] != 0) 
                    {  System.out.println("no");System.exit(0); }
        System.out.println("yes");System.exit(0);
     
     
    } 
}