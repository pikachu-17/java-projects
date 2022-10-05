import java.util.Scanner;

public class Leap_Year_Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scan.nextInt();
        leapyear(year);
    }

    static void leapyear(int yr) {
    if(yr%4==0&&(yr%400==0||yr%100!=0)){
        System.out.println("entered year is a leap year.");
    }
    else {
        System.out.println("entered year is not a leap year.");
    }

    }
}
