import java.util.Scanner;
class Main
{public static int gcd(int m, int n) {
        if (n == 0) 
          return m;
        else 
          return gcd(n, m % n);
    }
  
    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
 
         int num1 = sc.nextInt();
 
         int num2 = sc.nextInt();
         
        System.out.println("G.C.D of "+num1+" and "+num2+" is "+ gcd(num1,num2));
        //fill your code;
    }
}