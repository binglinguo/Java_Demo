package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-17 22:14
 **/
//青蛙跳台阶进阶
public class Demo2 {
    public int jumpFloorII (int number) {
        // write code here
        int n = 1;
        for(int i = 1;i < number; i++){
            n = n*2;
        }
        return n;
    }
}
