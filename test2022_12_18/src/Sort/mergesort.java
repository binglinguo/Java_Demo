package Sort;

public class mergesort implements Sort{
    /**
     * 归并排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(n)
     * 稳定性：稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {

        mergesort(array, 0,array.length-1);
    }
    public static void mergesort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        //拆
        int mid=left+((right-left)>>>1);
        mergesort(array,left,mid);
        mergesort(array,mid+1,right);

        //并 二路归并
        merge(array,left,mid,right);
    }
    public static void merge(int[] array,int left,int mid,int right){
        int[] ret=new int[(right-mid)+(mid-left)+1];
        int s1=left;
        int s2=mid+1;
        int k=0;
        while(s1<=mid&&s2<=right){
            if(array[s1]<array[s2]){
                ret[k++]=array[s1++];
            }else {
                ret[k++]=array[s2++];
            }
        }
        while(s1<=mid){
            ret[k++]=array[s1++];
        }
        while(s2<=right){
            ret[k++]=array[s2++];
        }
        for (int i = 0 ; i < k ; i++) {
            array[i+left]=ret[i];
        }
    }
}
