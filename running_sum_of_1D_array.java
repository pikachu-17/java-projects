public class running_sum_of_1D_array {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        for(int i =1; i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        System.out.println(nums);
    }
}
