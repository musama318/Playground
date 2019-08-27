import java.util.Scanner;
class Main
{public static int pow(int b, int p)
    {
        if (p != 0)
            return (b*pow(b, p - 1));
        else
            return 1;
    }
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int b=in.nextInt();
     int p=in.nextInt();
     System.out.println("The value of "+b+" power "+p+" is "+pow(b,p));
        //fill your code;
    }
}