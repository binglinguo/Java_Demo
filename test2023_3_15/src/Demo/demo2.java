package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-15 20:25
 **/
//旋转数组中的最小数字
public class demo2 {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while(array[left] >= array[right]){
            if(right - left == 1){
                mid = right;
                return array[mid];
            }
            mid = left + ((right - left )>>>1);
            if(array[left] == array[right] && array[left] == array[mid]){
                int min = array[left];
                for(int i = left + 1; i < right ;i++){
                    if(min > array[i]){
                        min = array[i];
                    }
                }
                return min;
            }
            if(array[mid] >= array[left]){
                left = mid;
            }else {
                right = mid;
            }
        }
        return array[mid];
    }
}
