package Sort;

public class HeapSort implements Sort{
    /**
     * 堆排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(1)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        int len=array.length-1;
        shiftBigHeap(array,len);//建堆的时间复杂度O(N)

        while(len>0){//N
            int t=array[0];
            array[0]=array[len];
            array[len]=t;
            shiftDown(array,0,len);//上下调整的时间复杂度O(logN)
            len--;
        }
    }

    public static void shiftBigHeap(int[] array,int len){
        for (int i = (len-1)/2 ; i >= 0  ; i--) {
            shiftDown(array,i,len);
        }
    }

    public static void shiftDown(int[] array,int root,int len){
        int maxIndex=root*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len && array[maxIndex]<array[maxIndex+1]){
                maxIndex++;
            }
            if(array[root]<array[maxIndex]){
                int t=array[root];
                array[root]=array[maxIndex];
                array[maxIndex]=t;
                root=maxIndex*2+1;
                maxIndex=root*2+1;
            }else {
                break;
            }
        }
    }
}
