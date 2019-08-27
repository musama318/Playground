import java.util.Scanner;
class Main
{ static int fact(int n)
  {
    if (n == 1||n==0)
      return 1;
  
    return (n*fact(n-1));
  }
 
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     System.out.println("The factorial of "+n+" is "+fact(n));
     
     //fill your code;
    }
}