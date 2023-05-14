package Demo1;

import java.util.Arrays;

public class Test3 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length>r*c)return mat;
        if(mat.length==r&&mat[0].length==c)return mat;
        int x=0;
        int y=0;
        int[][] arr=new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(y==c){
                    y=y/c;
                    x++;
                }
                arr[x][y]=mat[i][j];
                y++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2},{3,4}};
        //arr=matrixReshape(arr,1,4);
        System.out.println(Arrays.toString(matrixReshape(arr,2,4)));
    }
}
