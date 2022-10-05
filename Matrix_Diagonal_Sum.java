//not solved
public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               int repeating = mat[i].length-1/2;
                if (mat.length % 2 == 0 && (i == j || j == mat[i].length - i)) {
                    sum += mat[i][j];
                }else if(i == j || j == mat[i].length - i){
                    sum+=mat[i][j];
                }
            }
            System.out.println(sum);

        }
    }
}

//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int sum =0;
//        for(int i =0; i<mat.length; i++){
//            for (int j=0; j<mat[i].length;j++){
//                if(i==j || j==mat[i].length-i ){
//                    if(j==mat[i].length-i && i==j){
//                        continue;
//                    }
//                    else
//                        sum+=mat[i][j];
//                }
//            }
//        }
//        return (sum);
//
//    }
//}