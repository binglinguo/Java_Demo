package Sort;

public class choicesort implements Sort{
    /**
     * 选择排序
     * 时间复杂度O(N^2)
     * 空间复杂度O(1)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        for (int i = 0 ; i < array.length-1 ; i++) {
            int minIndex=i;
            for (int j = i ; j < array.length ; j++) {
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                swap(array,i,minIndex);
            }
        }
    }
}
