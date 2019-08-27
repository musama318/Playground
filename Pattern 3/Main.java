import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     for(int i=0;i<n;i++)
     {  for(int j=(2*i+1);j<=n*2-1;j=j+2)
           System.out.print(j+" ");
            System.out.println();                        }
       }
}