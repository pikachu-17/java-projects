
import java.util.Scanner;

public class Multiplication_Table_Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = scan.nextInt();
        table(a);
    }

    static void table(int a) {
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " x "+ i+ " = "+a*i);
        }
    }
}
