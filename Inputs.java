import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your roll number is "+ rollno);
        // bigger numbers can be written as 234_000_000 and not as 234,000,000.
    }
}
