import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int a=1,b=n*n+1;
     int b1=b;
     int n2=n*2;
     int n3=(n-1)*2;
     for(int i=1;i<=n;i++)
     { 
       for(int j=1;j<=n;j++)
       { if(j>=i&&j!=n2)             
           {System.out.print(a+"*");
              a=a+1;}
         else if(j==n2)
         {System.out.print(a);
           a=a+1;}
          else if(j<i)    
             System.out.print(" ");}
       
       //..................................
         for(int k=i;k<=n;k++)
         { 
           if(k>=i&&k!=n)             
           {          
           System.out.print(b+"*");             
              b=b+1;}
         else if(k==n)
         {System.out.print(b);
           b=b+1;
         }
          else if(k<i)     
             System.out.print(" ");
         
         }n2=n2-1;
       b=b-n3-1;
       n3=n3-2;
      System.out.println();    }
       }
}