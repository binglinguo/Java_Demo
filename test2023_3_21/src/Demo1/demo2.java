package Demo1;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-21 22:26
 **/
//找出出现总数大于一半的数字
public class demo2 {
    public int MoreThanHalfNum_Solution (int[] numbers) {
        if(numbers.length == 0){
            return -1;
        }
        // write code here
        int n = 0;
        int key = numbers[0];
        for(int i = 0 ; i < numbers.length ; i++ ){
            if(n == 0){
                key = numbers[i];
            }
            if(key == numbers[i]){
                n++;
            }else if(key != numbers[i]){
                n--;
            }
        }
        return key;
    }
}
