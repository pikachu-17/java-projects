import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        int P = input.nextInt();
        System.out.print("Enter the Rate of Interest: ");
        int R =input.nextInt();
        System.out.print("Enter the Time: ");
        int T =input.nextInt();

        int SI=(P*R*T)/100;
        System.out.println("Simple interest calculated is: रुपये"+ SI);
    }
}
