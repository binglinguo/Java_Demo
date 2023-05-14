package Demo2;

public class mergesort implements Sort{
    /**
     * 归并排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)
     * 稳定性：稳定
     * @param array
     */
    @Override
    public void sort(int[] array) {
        int left=0;
        int right=array.length-1;
        mergesort(array,left,right);
    }
    public static void mergesort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }
        //分解
        int privo=left+((right-left)>>>1);

        mergesort(array,left,privo);
        mergesort(array,privo+1,right);

        //合并
        merge(array,left,privo,right);
    }
    public static void merge(int[] array,int left,int mid,int right){
        int[] ret=new int[right-mid+(mid-left)+1];
        int r=left;
        int s2=mid+1;
        int k=0;
        while(left<=mid&&s2<=right){
            if(array[left]<array[s2]){
                ret[k++]=array[left++];
            }else {
                ret[k++]=array[s2++];
            }
        }
        while(left<=mid){
            ret[k++]=array[left++];
        }
        while(s2<=right){
            ret[k++]=array[s2++];
        }
        for (int i = 0; i < k; i++) {
            array[r+i]=ret[i];
        }
    }
}
