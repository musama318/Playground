import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner in =new Scanner(System.in);
      int []a=new int[7];
      int sal=0;
      int sum=0;
      int dif;
      for(int i=0;i<7;i++)
      a[i]=in.nextInt();
       for(int i=1;i<=5;i++)
       {
       if(a[i]<=8)
         sal+=(100*a[i]);
       else
       {
       dif=a[i]-8;
       sal+=(800+(115*dif));
       } 
         sum+=a[i];
       }
      if(sum>40)
        sal+=((sum-40)*125);
      if(a[0]>0)
      {
      sal+=(150*a[0]);
      }
      if(a[6]>0)
        sal+=(125*a[6]);
      
      System.out.println(sal);
      
      
      
      
      
    }
}