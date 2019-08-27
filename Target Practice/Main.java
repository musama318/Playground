import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n;
      int count=0;
      int turn=0;
      n=in.nextInt();
      while(turn<=100)
      {
      int input=in.nextInt();
        turn+=input;
        count++;
        
      }

      System.out.println("The number of turns is "+count);
    }
}