package Demo2;

public class choicesort implements Sort{
    /**
     * 选择排序
     * 时间复杂度O(N^2)
     * 空间复杂度O(1)
     * 稳定性：
     */
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min=i;
            //找出最小值的下标
            for (int j = i+1; j < array.length; j++) {
                if(array[min]>array[j]){
                    min=j;
                }
            }
            if(min!=i){
                swap(array,min,i);
            }
        }
    }
}
