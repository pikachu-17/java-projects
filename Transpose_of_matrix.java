public class Transpose_of_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i, j = 0;
        for (i = 0; i <= matrix.length; i++) {
            for (j = 0; j <= matrix[i].length; j++) {
                int temp = i;
                i = j;
                j = temp;
            }
        }
        System.out.println(matrix[i][j]);

    }
}
//actual solution
//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int m,n;
//        int res[][]= new int[matrix[0].length][matrix.length];
//        for(int i =0 ;i<matrix.length; i++){
//            for(int j=0;j<matrix[0].length; j++){
//                res[j][i]=matrix[i][j];
//            }
//        }
//        return res;
//    }
//}
