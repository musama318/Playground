import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int nc=0;
      int pc=0;
      for(int i=0;i<a;i++)
      {
      int b=in.nextInt();
        if(b>=0)
          pc++;
        else
          nc++;
      }
      System.out.println("Number of positive numbers is "+pc+" and the number of negative numbers is "+nc);

    }
}