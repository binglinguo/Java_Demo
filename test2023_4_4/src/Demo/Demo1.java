package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-04 22:08
 **/
//扫雷（类似） DFS 回溯
public class Demo1 {
    class Solution {
        // 以0 0 为基准
        public int[][] arrat = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        public void DFS(int[][] image,int sr,int sc,int[][] arr,int n,int m,
                        int newColor,int color){
            image[sr][sc] = color;
            arr[sr][sc] = 1;//当设置为1 的时候表示这一位已经被修改过
            for(int i = 0; i < 4; i++){
                int newX = sr + arrat[i][0];
                int newY = sc + arrat[i][1];
                //保存下一次移动的下标 先判断他们的合法性
                if(newX >= n || newX < 0 || newY >= m || newY < 0){
                    continue;
                }
                if(image[newX][newY] == newColor && arr[newX][newY] == 0){
                    DFS(image,newX,newY,arr,n,m,newColor,color);
                }
            }
        }
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int n = image.length;
            int m = image[0].length;
            int[][] arr = new int[n][m];
            DFS(image,sr,sc,arr,n,m,image[sr][sc],color);
            return image;
        }
    }
}
