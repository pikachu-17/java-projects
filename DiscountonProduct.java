import java.util.Scanner;

public class DiscountonProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float price, discount;
        System.out.println("enter the price of product: ");
        price = scan.nextFloat();
        System.out.println("enter the discount on product: ");
        discount=scan.nextFloat();
        float finalprice = price- (price*discount)/100;
        System.out.println("Final Price of product is: "+finalprice);
    }
}
