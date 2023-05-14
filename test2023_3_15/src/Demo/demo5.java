package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-15 21:11
 **/
//数组中出现次数超过一般的数字（摩尔投票法）
public class demo5 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int n = 0;
        int num = 0 ;
        for(int i = 0 ;i < array.length;i++){
            if(n == 0){
                num = array[i];
            }
            if(array[i] != num){
                n--;
            }else {
                n++;
            }
        }
        return num;
    }
}
