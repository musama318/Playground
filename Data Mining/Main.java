import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
           int number =in.nextInt();
        int value1 = 0;
        int value2 = 0;
        while (number > 0) 
        {
            if ((number % 10) % 2 == 0)
                value1 = value1 + number % 10;
            else
                value2 = value2 + number % 10;
            number = number / 10;
        }
      if(value1==value2)
        System.out.println("yes");
      else
        System.out.println("No");
       
    }
}