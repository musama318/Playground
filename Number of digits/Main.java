import java.util.Scanner;
class Main
{public static int sod(int n)
    {int sum=1;
        if (n/10!= 0)
            return (sum+sod(n/10));
        else
            return 1;
    }
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     System.out.println("The number of digits in "+n+" is "+sod(n));
        //fill your code;
    }
}