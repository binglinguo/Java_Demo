package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-17 23:43
 **/
//二进制中1的个数
public class demo3 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            n&=(n-1);
            count++;
        }
        return count;
    }
}
