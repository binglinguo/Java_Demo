package Sort;

public class quicksort implements Sort{
    /**
     * 切记等于号！！！
     * 快速排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)；
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        int left=0;
        int right=array.length-1;
        quicksort(array,left,right);
    }
    public static void quicksort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        //优化1 当数据较少时使用插入排序提升效率
        if(right-left+1<=888){
            insert(array,left,right);
        }

        //优化2 三数取中
        int mid=findMinIndex(array,left,right);
        int tmp=array[mid];
        array[mid]=array[left];
        array[left]=tmp;

        //确定后的
        int privo=quick(array,left,right);

        //左右分别做
        quicksort(array,left,privo-1);
        quicksort(array,privo+1,right);
    }

    public static int findMinIndex(int[] array,int left,int right){
        int midIndex=left+((right-left)>>>1);
        if(array[left]>array[midIndex]&&array[left]<array[right]||
        array[left]<array[midIndex]&&array[left]>array[right]){
            return left;
        }else if(array[right]>array[midIndex]&&array[right]<array[left]||
        array[right]<array[midIndex]&&array[right]>array[left]){
            return right;
        }else {
            return midIndex;
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

    public static int quick(int[] array,int left,int right){
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
