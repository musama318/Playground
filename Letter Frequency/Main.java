import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     String str=in.next();
     int n = str.length(); 
  
        int[] freq = new int[200]; 
  
        for (int i = 0; i < n; i++) 
            freq[str.charAt(i) - 'a']++; 
  
        for (int i = 0; i < 200; i++) { 
  
            if (freq[i] != 0) { 
  
                System.out.print((char)((char)i+'a')); 
                System.out.print(freq[i] + " ");  
                System.out.println();
                freq[i] = 0; 
     }}}
}