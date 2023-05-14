package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 16:43
 **/
//图形渲染
public class Demo2 {
    int[][] array = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public void DFS(int[][] image,int n,int m,int sr,int sc,int curColor,int color){
        image[sr][sc] = color;
        for(int i = 0;i < 4; i++){
            int newX = sr + array[i][0];
            int newY = sc + array[i][1];
            if(newX >= n || newX < 0||
                    newY >= m || newY < 0){
                continue;
            }
            if(image[newX][newY] == curColor){
                DFS(image,n,m,newX,newY,curColor,color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image.length == 0){
            return image;
        }
        if(image[sr][sc] == color){
            return image;
        }
        int n = image.length;
        int m = image[0].length;
        DFS(image,n,m,sr,sc,image[sr][sc],color);
        return image;
    }
}
