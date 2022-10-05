public class Plus_one {
    public static void main(String[] args) {
        int[] digits ={1,2,3};
         int sum =0;
         for(int i = digits.length-1;i>0;i--){
             sum+=digits[i];
         }
         sum++;
         for(int i =0; i<digits.length;i++){
             int a =sum%10;
             digits[i]=a;
             sum/=10;
         }
        System.out.println(digits);
    }
}
//class Solution {
//    public int[] plusOne(int[] digits) {
//        int n = digits.length;
//
//        for(int i = n-1; i >= 0; i--){
//            if(digits[i] == 9){
//                digits[i] = 0;
//            }else{
//                digits[i] += 1;
//                return digits;
//            }
//        }
//        int[] ans = new int[n+1];
//        ans[0] = 1;
//        for(int i = 1; i < n-1; i++){
//            ans[i] = 0;
//        }
//        return ans;
//    }
//}