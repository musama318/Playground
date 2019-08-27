import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       double a=1,b=2.0;
         
    System.out.print("1 "+b+" ");
    for(int i=3;i<=n;i++)
    {
        if(i%2==1)
        {
            a=a*3;
            System.out.print(a+" ");
        }
        else
        {
            b=b*3;
            System.out.print(b+" ");
        }
    }
      
	}
}