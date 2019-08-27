import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];

      int f=0;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
     int s=0,s1=0;
   
      for(int i=0;i<n;i++)
       if(a[i]%2==0)
         s=s+a[i];
      else
        s1=s1+a[i];
  
      System.out.println("The sum of the even numbers in the array is "+s+"\nThe sum of the odd numbers in the array is "+s1);
   
    }
}