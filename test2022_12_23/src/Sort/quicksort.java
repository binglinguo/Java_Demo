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

        //优化1 当数据较少时使用插入排序
        if(right-left+1<=3){
            insert(array,left,right);
        }

        //优化2 三数取中
        int mid=findMax(array,left,right);
        int tmp=array[mid];
        array[mid]=array[left];
        array[left]=tmp;

        int privo=findMaxIndex(array,left,right);

        quicksort(array,left,privo-1);
        quicksort(array,privo+1,right);
    }

    public static int findMax(int[] array,int left,int right){
        int mid=left+((right-left)>>>1);
        if(array[left]>array[mid]&&array[left]<array[right]||
           array[left]<array[mid]&&array[left]>array[right]){
            return left;
        }else if(array[right]>array[mid]&&array[right]<array[left]||
                 array[right]<array[mid]&&array[right]>array[left]){
            return right;
        }else {
            return mid;
        }
    }

    public static void insert(int[] array,int left,int right){
        for (int i = left ; i < right ; i++) {
            int tmp=array[i];
            int j=i-1;
            for (; j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    public static int findMaxIndex(int[] array,int left,int right){
        int tmp=array[left];
        while(left<right){
            while(left<right&&array[right]>=tmp){
                right--;
            }
            array[left]=array[right];
            while(left<right&& array[left]<=tmp ){
                left++;
            }
            array[right]=array[left];
        }
        array[right]=tmp;
        return left;
    }
}
