package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 11:41
 **/
import java.util.*;
public class Main {
    public static void main (String[] args) {
        System.out.print(2);
    }
}
/*
public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int count = 0;
        int end = array.length - 1;
        int mid = array.length / 2;
        int start = array.length / 2 - 1;
        int nn = array.length;
        while(nn >= 2 || end > mid){
            nn--;
            nn--;
            count += array[end];
            array[end] = 0;
            end --;
            count += array[mid];
            array[mid] = 0;
            mid++;
            while(start >= 0 && array[start] > mid / 2) {
                start--;
            }
            array[start] = 0;
            nn--;
        }
        System.out.println(count);
    }
 */
/*
    static int[][] table = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public static int DFS(int[][] array,int n,int m,int[][] book,int x,int y){
        int sum = 0;
        book[x][y] = 1;
        for(int i = 0;i < 4; i++){
            int newX = x + table[i][0];
            int newY = y + table[i][1];
            if(newX >= n || newX < 0||
               newY >= m || newY < 0){
                continue;
            }
            if(array[newX][newY] == 1 && book[newX][newY] != 1){
                sum += DFS(array,n,m,book,newX,newY);
            }
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                arr1[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                arr2[i][j] = scanner.nextInt();
            }
        }
        int[][] book1 = new int[n][n];
        int[][] book2 = new int[n][n];
        int max1 = 0;
        for(int i = 0;i < n; i++){
            for(int j = 0;j < n;j++){
                max1 = Math.max(DFS(arr1,n,n,book1,i,j),max1);
            }
        }
        int max2 = 0;
        for(int i = 0;i < n; i++){
            for(int j = 0;j < n; j++){
                max2 = Math.max(DFS(arr2,n,n,book2,i,j),max2);
            }
        }
        System.out.println(max1 + max2);
    }
 */
