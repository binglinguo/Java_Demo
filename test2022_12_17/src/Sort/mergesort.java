package Sort;

public class mergesort implements Sort{
    /**
     * 归并排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)
     * 稳定性：稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        int left=0;
        int right=array.length-1;
        mergesort(array,left,right);
    }
    public static void mergesort(int [] array,int left,int right){
        if(left>=right){
            return ;
        }

        int mid=left+((right-left)>>>1);

        //分
        mergesort(array,left,mid);
        mergesort(array,mid+1,right);

        //合
        merge(array,left,mid,right);
    }
    public static void merge(int[] array,int left,int mid,int right){
        //二路归并
        int[] ret=new int[(mid-left)+(right-mid)+1];
        int r=left;
        int mids=mid+1;
        int k=0;
        while(left<=mid&&mids<=right){
            if(array[left]<array[mids]){
                ret[k++]=array[left++];
            }else {
                ret[k++]=array[mids++];
            }
        }
        while(left<=mid){
            ret[k++]=array[left++];
        }
        while(mids<=right){
            ret[k++]=array[mids++];
        }
        //赋值回原数组
        for (int i = 0 ; i < k ; i++) {
            array[i+r]=ret[i];
        }
    }
}
