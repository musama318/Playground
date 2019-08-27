import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sq=n*n;
      int rem,sum=0;
      while(sq!=0)
      {
      rem=sq%10;
        sum+=rem;
        sq=sq/10;
      }
        if(sum==n)
          System.out.println("Kaprekar Number");
      else
        System.out.println("Not A Kaprekar Number");

    }
}