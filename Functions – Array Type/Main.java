import java.util.*;
class Main
{
  public static int aty(int n,int a[])
  {int o=0,e=0;
    for(int i=0;i<n;i++)
    {if(a[i]%2==0)
       e+=1;
     else
       o+=1;
    }
  if(e==n)
    return 1;
  else if(o==n)
    return 2;
   else
     return 3;
  }
  
  public static void main(String args[])
  {Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
     a[i]=in.nextInt();
   int res=aty(n,a);
   if(res==1)
     System.out.println("The array is Even");
   else if(res==2)
     System.out.println("The array is Odd");
   else if(res==3)
     System.out.println("The array is Mixed");
    //type your code here
  }
}