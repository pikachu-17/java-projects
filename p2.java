import java.util.*;

public class p2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String wonders[] = { "chicken itza", "christ the reedemer", "taj mahal", "great wall of china", "nachu pichu",
                "petre collesum" };
        String locations[] = { "MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY" };

        System.out.println("Enter the country name");
        String c = sc.next();
        int flag = 0;
        int len = locations.length;

        for (int i = 0; i < len; i++) {
            if (c.equalsIgnoreCase(locations[i])) {
                flag = 1;
                System.out.println(locations[i] + "'s wonder is" + wonders[i]);
                break;

            }
        }
        if (flag == 0)
            System.out.println("Sorry not found");
    }
}
