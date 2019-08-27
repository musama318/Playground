import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     String s1=in.next();
     String s2=in.next();
     String r=""; 
  
        for (int i = s1.length()-1; i>=0; i--) 
            r=r+s1.charAt(i);

     if(r.equals(s2))
       System.out.println("It is same");
     else
       System.out.println("It is not same");
		// fill your code
	}
}