import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Two Numbers: ");
    int n1= input.nextInt();
    int n2= input.nextInt();
    System.out.println("Enter operator: ");
    String op = input.next();
    if (op.equals("+"))
    {
        int sum = n1+n2;
        System.out.println("Sum: " + sum);
    }
    else if (op.equals("-")) {
        int sub = n1-n2;
        System.out.println("Subtraction: " + sub);
    }
    else if(op.equals("*")){
        int mul = n1*n2;
            System.out.println("Multiplication: "+ mul);
        }
    else if(op.equals("/")){
        int div= n1/n2;
            System.out.println("Division: " + div);
    }
    }
}
