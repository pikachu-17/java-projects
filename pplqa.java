import java.util.*;

public class pplqa {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 50;
        int numbers[] = new int[50];
        System.out.println("Enter 50 values");
        for (int i = 0; i < 50; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < 50; i++) {
            if (numbers[i] > max)
                max = numbers[i];

            else if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("highest scores" + max);
        System.out.println("minimum scores" + min);
    }
}
