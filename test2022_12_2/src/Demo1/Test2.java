package Demo1;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;

public class Test2 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length>c*r)return mat;
        int[][] arr=new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int a=(i+j)/c;
                int b=(i*mat[i].length+j);
                arr[a][b]=mat[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,},{3,4}};
        //arr=matrixReshape(arr,1,4);
        System.out.println(Arrays.toString(matrixReshape(arr,1,4)));
    }
    /**
     *  买卖股票的最佳时机
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max= Integer.MAX_VALUE;
        int marry=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<max){
                max=prices[i];
            }
            if(marry<prices[i]-max){
                marry=prices[i]-max;
            }
        }
        return marry;
    }
    public static void main1(String[] args) {

    }
}
