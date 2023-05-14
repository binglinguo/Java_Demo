package Demo1;

import java.util.Arrays;

public class Test4 {
    public static void setZeroes(int[][] matrix) {
        int[] x=new int[100];
        int[] y=new int[100];
        int n=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    x[n]=i;
                    y[n]=j;
                    n++;
                }
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(i==x[k]){
                        matrix[i][j]=0;
                    }
                }
            }

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(j==y[k]){
                        matrix[i][j]=0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr=new int[][]{{0, 0, 5, 8, 3, 8}, {9, 4, 1, 9, 9, 5}, {0, 4, 3, 0, 2, 7}, {1, 6, 0, 0, 3, 0}
                , {4, 4, 0, 3, 3, 7}, {0, 3, 7, 5, 1, 0}};
        setZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
