import java.util.Scanner;
class Main
{ static int s(int[] arr, int n)
  {
    if (n <= 0) 
        return 0;
   else 
     if(arr[n-1]%2==0)
       return (s(arr, n - 1) + arr[n - 1]);
     else
       return (s(arr, n - 1) + 0);
  }
 
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int a[]=new int[n];
     for (int i=0;i<n;i++)
         a[i]=in.nextInt();
     System.out.println("Sum of even numbers "+s(a,n));
     
     //fill your code;
    }
}