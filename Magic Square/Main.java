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
 
     int sum = 0,sum2=0;  
        for (int i = 0; i < n; i++) 
            sum = sum + a[i][i]; 
  
        for (int i = 0; i < n; i++) 
            sum2 = sum2 + a[i][n-1-i]; 
  
        if(sum!=sum2)  
        { System.out.println("no");
        System.exit(0);
        }  
  
        
        for (int i = 0; i < n; i++) { 
  
            int rowSum = 0; 
            for (int j = 0; j < n; j++) 
                rowSum += a[i][j]; 
  
             
            if (rowSum != sum) 
            { System.out.println("no");System.exit(0);} 
        } 
  
        
        for (int i = 0; i < n; i++) { 
  
            int colSum = 0; 
            for (int j = 0; j < n; j++) 
                colSum += a[j][i]; 
  
            
            if (sum != colSum) 
            {    System.out.println("no"); System.exit(0);}
        } 
  
        System.out.println("yes");System.exit(0); 
    } 
}