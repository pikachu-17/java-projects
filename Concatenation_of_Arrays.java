import java.util.Scanner;
import java.util.Arrays;

public class Concatenation_of_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums= {1,2,1};
        int[] ans = new int[(nums.length)*2];
        for(int i = 0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        System.out.println(ans);
    }
}