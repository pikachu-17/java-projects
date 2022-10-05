import java.util.Scanner;
import java.util.Arrays;
public class Two_Sum {
    public static int[] main(String[] args) {
        int[] nums ={2,7,11,15};
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        for(int i =0; i<nums.length;i++){
            if(target==nums[i]+nums[i+1]){
                return new int[] {i,i+1};
            }
        }
        return nums;
    }
}
