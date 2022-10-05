import java.util.Scanner;

public class FactorsofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        for (int i=0;i<num;i++){
            for (int j =0;j<num;j++)
             if(i*j==num)
                 System.out.print(i+" ");

        }
    }
}

