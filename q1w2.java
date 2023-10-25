import java.util.*;

public class q1w2 {
    int customer_id;
    String name;
    int units;
    double bill;
    double scharge;

    public q1w2() {
        customer_id = 0;
        name = "";
        units = 0;
        bill = 0.0d;

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your customer id");
        customer_id = sc.nextInt();
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter no of units consumed");
        units = sc.nextInt();
    }

    public void calculate() {
        if (units <= 100)
            bill = 3 * units;

        else if (units >= 100 && units <= 200)
            bill = 300 + (units - 100) * 5;

        else if (units >= 200 && units <= 300)
            bill = 300 + 500 + (units - 200) * 7;

        else if (units > 300)
            bill = 300 + 500 + 700 + (units - 300) * 10;

        scharge = bill * 0.05;
        bill = scharge + bill;
    }

    public void display() {
        System.out.println("Customer ID" + customer_id + "name" + name + "units" + units + "Bill amount" + bill);
    }

    public static void main() {
        q1w2 obj = new q1w2();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
