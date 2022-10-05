import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of subjects: ");
        int n = scan.nextInt();
        int sum =0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter Marks: ");
            int a = scan.nextInt();
            sum +=a;
        }
        System.out.println("Average of the marks is : "+sum/n);

    }
}
