package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-31 22:44
 **/
//二进制插入 从第j位插入到第i位 并且保证插入的位置都为0
public class Demo3 {
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        return n ^ (m << j);
    }
}
