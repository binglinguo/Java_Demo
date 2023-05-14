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
        heapMaxTree(array);

        int len=array.length-1;

        while(len>=0){
            int t=array[0];
            array[0]=array[len];
            array[len]=t;

            heap(array,0,len);
            len--;
        }
    }

    public static void heapMaxTree(int[] array){
        int len=array.length-1;
        for (int i = (len-1)/2 ; i >= 0 ; i--) {
            heap(array,i,len);
        }
    }

    public static void heap(int[] array,int root,int len){
        int maxIndex=root*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len&&array[maxIndex]<array[maxIndex+1]){
                maxIndex++;
            }
            if(array[root]<array[maxIndex]){
                int t=array[root];
                array[root]=array[maxIndex];
                array[maxIndex]=t;

                root=maxIndex;
                maxIndex=root*2+1;
            }else {
                break;
            }
        }
    }
}
