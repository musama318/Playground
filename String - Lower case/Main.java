import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     String a=in.next();
		for (int i = 0; i< a.length(); i++)
          {  char aChar = a.charAt(i);
                if (65 <= aChar && aChar<=90)
                  aChar = (char)((aChar+32)); 
                
          System.out.print(aChar);
          }
// fill your code
	}
}