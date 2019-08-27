import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{String r = ""; //To store the reverse
    Scanner sc = new Scanner(System.in);
    String s = sc.next(); // Entering the string

    for(int i= s.length() - 1;i>=0;i--) {
        r = r + s.charAt(i);
    }

    if(r.equals(s)) {
        System.out.println("Palindrome");
    }
    else {
        System.out.println("Not a Palindrome");
    }
		// fill your code
	}
}