package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-13 18:40
 **/
public class Demo2 {
    public static int min = Integer.MAX_VALUE;
    public static int[][] table = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    //ch为迷宫内容 n和m为迷宫的整体大小 i和j为当前下标 bool存储走过的路 并且可以保证不走回头路 count记录当前走的步数
    public static void BFS(char[][] ch,int n,int m,int i,int j,int[][] bool,int count){
        count++;
        bool[i][j] = count;
        char tmp = ch[i][j];
        ch[i][j] = '#';
        if(i == n - 1 && j == n - 2){
            min = Math.min(min,bool[i][j]);
            return ;
        }
        for(int k = 0;k < 4; k++){
            int newX = i + table[k][0];
            int newY = j + table[k][1];
            //判断下标的有效性
            if(newX < 0 || newX >= n|| newY < 0 || newY >= m){
                continue;
            }
            if(ch[newX][newY] == '#' ){
                continue;
            }
            BFS(ch,n,m,newX,newY,bool,count);
        }
        //ch[i][j] = tmp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String[] str = new String[10];
            for(int i = 0;i < 10; i++){
                str[i] = scanner.next();
            }
            char[][] chs = new char[10][10];
            for(int i = 0;i < 10; i++){
                for(int j = 0; j < 10; j++){
                    chs[i][j] = str[i].charAt(j);
                }
            }
            int[][] bool = new int[10][10];
            BFS(chs,10,10,0,1,bool,0);
            System.out.println(min - 1);
            min  = Integer.MAX_VALUE;
        }
    }
}
