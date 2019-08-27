import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     String s1=in.nextLine();
     int i=0;
     i=s1.indexOf("the");
     String r="";
     for(int j=0;j<i;j++)
       r=r+s1.charAt(j);
     for(int k=i+4;k<s1.length();k++)
       r=r+s1.charAt(k);
     System.out.println(r);
		// fill your code
	}
}