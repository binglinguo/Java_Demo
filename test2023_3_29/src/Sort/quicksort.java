package Sort;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 22:21
 **/
public class quicksort implements sort{

    @Override
    public void sort (int[] array) {
        quickSort(array,0,array.length-1);
    }

    private void quickSort (int[] array , int left , int right) {
        if(left >= right){
            return ;
        }

        //当数据量小于一定程度的时候 使用插入排序提高效率
        if(right - left <= 3){
            insertSort(array,left,right);
            return ;
        }
        //三数取中
        int midIndex = findMidIndex(array,left,right);
        if(midIndex != left){
            int t = array[left];
            array[left] = array[midIndex];
            array[midIndex] = t;
        }


        int privo = FindIndex(array,left,right);
        quickSort(array,left,privo - 1);
        quickSort(array,privo + 1,right);
    }

    private void insertSort (int[] array , int left , int right) {
        for(int i = left + 1; i <= right; i++){
            int j = i - 1;
            int t = array[i];
            for(; j >= 0; j--){
                if(array[j] > t){
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = t;
        }
    }

    private int findMidIndex (int[] array , int left , int right) {
        int mid = (left +((right - left) >>> 1));
        if(array[mid] > array[left] && array[mid] < array[right]||
           array[mid] < array[left] && array[mid] > array[right]){
            return mid;
        }else if(array[right] > array[left] && array[right] < array[mid] ||
                 array[right] < array[left] && array[right] > array[mid]){
            return right;
        }else {
            return left;
        }
    }

    private int FindIndex (int[] array , int left , int right) {
        int t = array[left];
        while(left < right){
            while(left < right && array[right] >= t){
                right--;
            }
            array[left] = array[right];
            while(left < right && array[left] <= t){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = t;
        return right;
    }
}
