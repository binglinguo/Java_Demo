package Sort;

public class HillSort implements Sort{
    /**
     * 希尔排序
     * 时间复杂度O(N^1.3)~O(N^1.5)
     * 空间复杂度O(1)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        for (int gao = 5 ; gao >= 0 ; gao-=2) {
            for (int i = gao ; i < array.length ; i+=gao) {
                int t=array[i];
                int j=i-gao;
                for (; j>=0;j-=gao){
                    if(array[j]>t){
                        array[j+gao]=array[j];
                    }else {
                        break;
                    }
                }
                array[j+gao]=t;
            }
        }
    }
}
