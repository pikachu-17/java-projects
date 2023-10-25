import java.util.*;

public class p1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        int marks[] = new int[n];
        String names[] = new String[n];
        double avg = 0;
        int sum = 0;
        double dev = 0.0d;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks");
            marks[i] = sc.nextInt();
            names[i] = sc.next();

            sum = marks[i] + sum;
        }

        avg = sum / n;

        for (int i = 0; i < n; i++) {
            dev = avg - marks[i];
            System.out.println("Deviation of" + names[i] + "is" + marks[i]);
        }
        System.out.println("average is" + avg);

    }
}
