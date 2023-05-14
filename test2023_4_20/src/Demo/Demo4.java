package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-20 21:41
 **/
import java.util.*;
class Node{
    public int x;
    public int y;
    public Node(int x,int y){
        this.x = x;
        this.y = y;
    }
}
//迷宫问题
public class Demo4 {
    public static int[][] table = {{0,1},{1,0},{0,-1},{-1,0}};
    public static void find(int[][] array,int start,int end,
                            int x,int y,int[][] bool,List<Node> list,List<Node> minList){
        Node node = new Node(x,y);
        list.add(node);
        bool[x][y] = 1;
        if(x == start - 1 && y == end - 1){
            if(minList.isEmpty() ||list.size() < minList.size()){
                minList.clear();
                for(Node node1 : list){
                    minList.add(node1);
                }
                return ;
            }
        }
        for(int i = 0;i < 4; i++){
            int newX = x + table[i][0];
            int newY = y + table[i][1];
            if(newX < 0 || newX >= start ||
                    newY < 0 || newY >= end ||
                    bool[newX][newY] == 1 ||
                    array[newX][newY] == 1){
                continue;
            }
            find(array,start,end,newX,newY,bool,list,minList);
            list.remove(list.size() - 1);
            bool[x][y] = 1;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int[][] bool  = new int[n][m];
        for(int i = 0;i < n; i++){
            for(int j = 0;j < m; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        List<Node> list = new LinkedList<>();
        List<Node> minList = new LinkedList<>();
        find(array,n,m,0,0,bool,list,minList);
        for(Node node : minList){
            System.out.println("(" + node.x + "," + node.y +")");
        }
    }
}
