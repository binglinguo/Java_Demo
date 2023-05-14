package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-18 23:37
 **/
//不用加减乘除实现加法
public class Demo4 {
    public int Add(int num1,int num2) {
        return num2 == 0 ? num1 : Add(num1 ^ num2, (num1 & num2) << 1);
    }
}
