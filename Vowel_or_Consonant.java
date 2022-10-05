import java.util.Objects;
import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        String input = scan.next();
        if (input == "a" || input == "e" || input == "i" || input == "o" || input == "u" || input == "A" || input == "E" || input == "I" || input == "O" || input == "U") {
            System.out.print("given input is a vowel.");
        } else {
            System.out.print("given input is consonant.");
        }
    }
}
