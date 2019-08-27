import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++)
      a[i]=in.nextInt();
   int min=99;
    int max=0;
    for (int i=0;i<n;i++)
    {if(a[i]<min)
        min=a[i];
     if(a[i]>max)
       max=a[i];}
    System.out.println("The range of the array is "+(max-min));
      //type your code here
  }
}