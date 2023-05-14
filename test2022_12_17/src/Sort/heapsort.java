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
        //建堆
        maxHeap(array);

        //交换元素
        while(len>0){
            int tmp=array[0];
            array[0]=array[len];
            array[len]=tmp;

            shiftDowm(array,0,len);
            len--;
        }
    }
    public static void maxHeap(int[] array){
        for (int lastTreeIndex=(array.length-1-1)/2; lastTreeIndex>=0;lastTreeIndex--){
            //调整为大根
            shiftDowm(array,lastTreeIndex,array.length-1);
        }
    }
    public static void shiftDowm(int[] array,int index,int len){
        int maxIndex=index*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len && array[maxIndex]<array[maxIndex+1]){
                maxIndex++;
            }
            if(array[maxIndex]>array[index]){
                int tmp=array[index];
                array[index]=array[maxIndex];
                array[maxIndex]=tmp;
                index=maxIndex;
                maxIndex=index*2+1;
            }else {
                break;
            }
        }
    }
}
