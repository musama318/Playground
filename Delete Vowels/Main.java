import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     String s=in.next();
     String r="";
     for(int i=0;i<s.length();i++)
     {char ch = s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
                 r=r+s.charAt(i);    
     }
     System.out.println(r);//fill your code;
    }
}