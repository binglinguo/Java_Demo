package Sort;

public class QuickSort implements Sort{
    /**
     * 快速排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        quickSort(array,0,array.length-1);
    }

    public static void quickSort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        int privo=findIndex(array,left,right);

        quickSort(array,left,privo-1);
        quickSort(array,privo+1,right);
    }

    public static int findIndex(int[] array,int left,int right){
        int t=array[left];
        while(left<right){
            while(left<right && array[right]>=t){
                right--;
            }
            array[left]=array[right];
            while(left<right && array[left]<=t){
                left++;
            }
            array[right]=array[left];
        }
        array[left]=t;
        return right;
    }
}
