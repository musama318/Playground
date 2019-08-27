import java.util.Scanner;
class Main
{public static int sod(int n)
    {
        if (n/10!= 0)
            return (n%10+sod(n/10));
        else
            return n%10;
    }
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     System.out.println("The sum of digits in "+n+" is "+sod(n));
        //fill your code;
    }
}