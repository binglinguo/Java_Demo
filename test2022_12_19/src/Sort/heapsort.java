package Sort;

public class heapsort implements Sort{
    /**
     * 堆排序
     * 时间复杂度O(N^log2^N)
     * 空间复杂度O(N)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        heapsort(array,array.length-1);
    }
    public static void heapsort(int[] array,int len){
        //构建大堆
        heap(array,len);

        //进行交换
        while(len>0){
            int tmp=array[len];
            array[len]=array[0];
            array[0]=tmp;
            len--;
            shiftTree(array,0,len);
        }
    }
    public static void heap(int[] array,int len){
        for (int i = (len-1)/2 ; i >= 0  ; i--) {
            shiftTree(array,i,len);
        }
    }
    public static void shiftTree(int[] array,int root,int len){
        int maxIndex=root*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len && array[maxIndex]<array[maxIndex+1]){
                maxIndex++;
            }
            if(array[root]<array[maxIndex]){
                int tmp=array[root];
                array[root]=array[maxIndex];
                array[maxIndex]=tmp;
                root=maxIndex;
                maxIndex=root*2+1;
            }else {
                break;
            }
        }
    }
}
