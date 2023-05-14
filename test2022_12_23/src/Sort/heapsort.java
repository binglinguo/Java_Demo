package Sort;

public class heapsort implements Sort{
    /**
     * 堆排序
     * 时间复杂度O(N*log2^N)
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
        heapMaxTree(array);

        while(len>=0){
            int tmp=array[len];
            array[len]=array[0];
            array[0]=tmp;

            heap(array,0,len);
            len--;
        }
    }

    public static void heapMaxTree(int[] array){
        for (int i = (array.length-1-1)/2 ; i >=0  ; i--) {
            heap(array,i,array.length-1);
        }
    }

    public static void heap(int[] array,int root,int len){
        int maxIndex=root*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len&&array[maxIndex]<array[maxIndex+1]){
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
