import java.util.Scanner;

public class Voting_eligibility_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age of person:");
        int age = scan.nextInt();
        eligibility(age);
    }

    static void eligibility(int age) {
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
