import java.util.Scanner;
class Main
{ static int rMax(int[] arr, int length)
  {
    if (length == 1)
      return arr[0];
    return max(rMax(arr, length - 1), arr[length - 1]);
  }
 
  private static int max(int n1, int n2)
  {
    return n1 > n2 ? n1 : n2;
  }
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int a[]=new int[n];
     for (int i=0;i<n;i++)
         a[i]=in.nextInt();
     System.out.println("Maximum element in the array is "+rMax(a,n));
     
     //fill your code;
    }
}