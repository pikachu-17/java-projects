import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the Runs: ");
        int runs = scan.nextInt();
        System.out.println("enter the number of times the player gets out:");
        int out= scan.nextInt();
        System.out.println("The Batting average of the player is: "+runs/out);

    }




}
