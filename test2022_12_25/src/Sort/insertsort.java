package Sort;

public class insertsort implements Sort{
    /**
     * 插入排序
     * 时间复杂度O(N^2)
     * 最优O(N)
     * 空间复杂度O(1)
     * 稳定性：稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        for (int i = 1 ; i < array.length ; i++) {
            int t=array[i];
            int j=i-1;
            for (; j>=0 ;j--){
                if(array[j]>t){
                    array[j+1]=array[j] ;
                } else {
                    break;
                }
            }
            array[j+1]=t;
        }
    }
}
