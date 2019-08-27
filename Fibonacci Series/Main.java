import java.util.Scanner;
class Main
{ public static int fib(int n) 
{
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
}


    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     System.out.println("The term "+n+" in the fibonacci series is "+fib(n-1));
     
     //fill your code;
    }
}