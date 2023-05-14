package Code;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 20:41
 **/
public class demo6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int[] array = new int[4];
            for(int i = 0 ; i < 4; i++){
                array[i] = scanner.nextInt();
            }
            int A = (array[0] + array[2]) / 2;
            int B = (array[1] + array[3]) / 2;
            int C = array[3] - B;
            if(A - B != array[0] || B - C != array[1] || A + B != array[2] || B + C != array[3]){
                System.out.println("No");
            }else {
                System.out.println(A + " " + B + " " + C);
            }
        }
    }
}
