package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-15 20:38
 **/
//调整数组顺序使奇数位于偶数前面
public class demo3 {
    public void reOrderArray(int [] array) {
        int k = 0;
        for(int i = 0;i < array.length ;i++){
            if(array[i] % 2 == 1){
                int t = array[i];
                int j = i;
                while(j > k){
                    array[j]=array[j-1];
                    j--;
                }
                array[k++] = t;
            }
        }
    }
}
