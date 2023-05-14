package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 00:21
 **/
//不要二
public class demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int[][] array = new int[w][h];
            int count = 0;
            for(int i = 0; i < w ; i++){
                for(int j = 0; j < h ; j++){
                    if(array[i][j] == 0){
                        count++;
                        if(i + 2 < w){
                            array[i + 2][j] = 1;
                        }
                        if(j + 2 < h){
                            array[i][j + 2] = 1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
