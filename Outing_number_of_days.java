import java.util.Scanner;

public class Outing_number_of_days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of days in month you want to go for outing: ");
        int nod = scan.nextInt();
        switch (nod) {
            case 31, 30 -> System.out.println("15 days");
            case 29, 28 -> System.out.println("14 days");
        }
    }
}
