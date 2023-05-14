package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 22:12
 **/
//只出现一次的两个数字更优解
public class demo2 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length == 0 || num1 == null || num2 == null){
            return ;
        }
        //1.先找出两个不同数字异或的结果
        int num = array[0];
        for( int i = 1; i < array.length; i++){
            num ^= array[i];
        }
        //2.根据异或的规则 如果有一位为1 那么代表两个数字该位置必定不一样
        int n = 0;
        for(; n < 32; n++){
            if(((1 << n) & num) != 0){
                break;
            }
        }
        //3.根据这一位数字的不同 将数组中的所有元素分为两组 即可找到不同的数字
        //初始化一下 避免传入的数组中元素有值 导致结果错误
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(((1 << n) & array[i]) == 0){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
    }
}
