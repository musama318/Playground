import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
   Scanner in =new Scanner(System.in);
      int n=in.nextInt();
     if(n%2==0)
      System.out.println("Even");
      else
        System.out.println("Odd");
    }
}