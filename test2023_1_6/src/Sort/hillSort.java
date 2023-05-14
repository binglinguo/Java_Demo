package Sort;

public class hillSort implements Sort{
    /**
     * 希尔排序
     * 时间复杂度O(N^1.3)~O(N^1.5)
     * 空间复杂度O(1)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        for (int gap = 5 ; gap >= 0 ; gap-=2) {
            for (int i = gap ; i < array.length ; i+=gap) {
                int t=array[i];
                int j=i-gap;
                for (; j>=0;j-=gap){
                    if(array[j]>t){
                        array[j+gap]=array[j];
                    }else {
                        break;
                    }
                }
                array[j+gap]=t;
            }
        }
    }
}
