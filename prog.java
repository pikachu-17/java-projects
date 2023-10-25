import java.util.*;

public class prog {
    public static void main()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str = sc.next();
        int len = str.length();

        String nstr = "";
        for (int i = 0; i <= len; i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch))
                nstr = nstr + ch;
        }
        System.out.println("New string: " + nstr);
    }
}
