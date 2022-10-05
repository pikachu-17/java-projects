import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.next();
        System.out.println("Hola!, " + name + ", Como Estas?");
    }
}
