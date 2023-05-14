package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-08 22:51
 **/
//红与黑
public class Demo3 {
    static int[][] table = {{1,0},{0,-1},{-1,0},{0,1}};
    public static void BFS(String[] array,int x,int y,int[][] bool ,int n, int m){
        bool[x][y] = 1;
        for(int i = 0;i < 4; i++){
            int newx = x + table[i][0];
            int newy = y + table[i][1];
            if(newx < 0 || newx >= n||
                    newy < 0 || newy >= m||
                    bool[newx][newy] == 1){
                continue;
            }
            if(array[newx].charAt(newy) == '#'){
                continue;
            }
            BFS(array,newx,newy,bool,n,m);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String[] array = new String[n];
            int x = 0;
            int y = 0;
            for(int i = 0;i < n ; i++){
                array[i] = scanner.next();
                for(int j = 0 ;j < m; j++){
                    if(array[i].charAt(j) == '@'){
                        x = i;
                        y = j;
                        break;
                    }
                }
            }
            int[][] bool = new int[n][m];
            //初始化都为0
            BFS(array,x,y,bool,n,m);
            int count = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    count += bool[i][j];
//                     System.out.print(bool[i][j] + "   ");
                }
//                 System.out.println();
            }
            System.out.println(count);
        }
    }
}
