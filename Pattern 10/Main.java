import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int l=n;
     int a=1,b=2;
     for(int i=1;i<=n;i++)
     {  for(int j=1;j<=n;j++)
         if(j==l)    
            System.out.print(b);
          else     
             System.out.print(a);
      a=a+1;
      b=b+1;
      if(l==n)
        l=1;
      else
        l=n;
          System.out.println();    }
       }
}