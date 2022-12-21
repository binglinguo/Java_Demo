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
        heapMaxTree(array,len);


        //交换
        while(len>=0){
            int tmp=array[len];
            array[len]=array[0];
            array[0]=tmp;

            len--;
            heap(array,0,len);
        }
    }

    public static void heapMaxTree(int[] array,int len){
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
            if(array[maxIndex]>array[root]){
                int tmp=array[maxIndex];
                array[maxIndex]=array[root];
                array[root]=tmp;
                root=maxIndex;
                maxIndex=root*2+1;
            }else {
                break;
            }
        }
    }
}
