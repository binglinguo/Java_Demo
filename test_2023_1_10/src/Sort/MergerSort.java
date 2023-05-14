package Sort;

public class MergerSort implements Sort{
    /**
     * 归并排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)
     * 稳定性：稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        //mergersort(array,0,array.length-1);
        //非递归
        for (int gap = 1 ; gap < array.length ; gap+=gap) {
            for (int i = 0 ; i < array.length ; i+=2*gap) {
                int left=i;
                int mid=left+gap-1;
                if(mid>=array.length){
                    mid=array.length-1;
                }
                int right=mid+gap;
                if(right>=array.length){
                    right=array.length-1;
                }
                merger(array,left,mid,right);
            }
        }
    }

    public static void mergersort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }
        int mid=left+((right-left)>>1);
        mergersort(array,left,mid);
        mergersort(array,mid+1,right);

        merger(array,left,mid,right);
    }

    public static void merger(int[] array,int left,int mid,int rignt){
        int[] ret=new int[(rignt-mid)+(mid-left)+1];
        int k=0;
        int s1=left;
        int s2=mid+1;
        while(s1<=mid && s2<=rignt){
            if(array[s1]<=array[s2]){
                ret[k++]=array[s1++];
            }else {
                ret[k++]=array[s2++];
            }
        }
        while(s1<=mid){
            ret[k++]=array[s1++];
        }
        while(s2<=rignt){
            ret[k++]=array[s2++];
        }
        for (int i = 0 ; i < k ; i++) {
            array[i+left]=ret[i];
        }
    }
}
