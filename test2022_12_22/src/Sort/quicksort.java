package Sort;

public class quicksort implements Sort{
    /**
     * 快速排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        quicksort(array,0,array.length-1);
    }

    public static void quicksort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        int privo=findIndex(array,left,right);

        quicksort(array,left,privo-1);
        quicksort(array,privo+1,right);
    }

    public static int findIndex(int[] array,int left,int right){
        int tmp=array[left];
        while(left<right){
            while(left<right && array[right]>=tmp){
                right--;
            }
            array[left]=array[right];
            while(left<right && array[left]<=tmp){
                left++;
            }
            array[right]=array[left];
        }
        array[left]=tmp;
        return left;
    }
}
