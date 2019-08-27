import java.util.*;
class Main
{
  public static void main(String args[])
  {Scanner in =new Scanner(System.in);
   int n=in.nextInt();
   int a[]=new int[20];
   for(int i=0;i<n;i++)
     a[i]=in.nextInt();
   
   int temp;
   for (int i = 0; i < n; i++) 
     {for (int j = i+1; j <n; j++) 
       { if (a[i] > a [j]) 
         { temp = a[j];
           a[j] = a[i];
            a[i] = temp;
     }
    }
   }
   
   double m;
   if(n%2==0)
     m=(double)((double)(a[n/2]+a[(n/2)-1])/2);
   else
     m=(double)a[((n+1)/2)-1];
  
   String s=String.format("%.2f",m) ;
     System.out.println("The median of the array is "+s);
    //type your code
  }
}