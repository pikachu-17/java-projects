
import java.util.*;
public class string_pal
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        String rev="";
        str=str.trim();
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        
        if(rev.equalsIgnoreCase(str))
        System.out.println("It is a palindrome string");
        
        else
        System.out.println("It is not a palindrome stirng");
        
    }
}
