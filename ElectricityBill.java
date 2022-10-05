import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the units of electricity used: ");
        float a = scan.nextFloat();
        float bill=0;
        if (a<100){
            bill = (float) (a*1.20);
        }
        else if(a>100&&a<300){
            bill = (float)(100*1.20+(a-100)*2);
        }
        else if(a>300){
            bill = (float)(100*1.20+200*2+(a-300)*3);
        }
        System.out.println("The total bill is: "+ bill);
    }
}
