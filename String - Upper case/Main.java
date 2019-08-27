import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     String a=in.next();
		for (int i = 0; i< a.length(); i++)
          {  char aChar = a.charAt(i);
                if (97 <= aChar && aChar<=122)
                  aChar = (char)((aChar - 32)); 
                
          System.out.print(aChar);
          }
// fill your code
	}
}