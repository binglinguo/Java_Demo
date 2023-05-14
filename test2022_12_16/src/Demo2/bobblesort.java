package Demo2;

public class bobblesort implements Sort{
    /**
     * 冒泡排序
     * 时间复杂度 O(N^2)
     * 空间复杂度O(1)
     * 稳定性：稳定
     */
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                   swap(array,j,j+1);
                }
            }
        }
    }
}
