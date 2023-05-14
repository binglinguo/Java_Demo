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
        int left=0;
        int right=array.length-1;
        quicksort(array,left,right);
    }
    public static void quicksort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }
        //优化,当数组个数小于1400，调用插入排序会大大增加速度
        if(right-left<=1400){
            insert(array,left,right);
        }

        //三数取中 优化速度 保证每次取到的值每次都为中间值
        int findMid=findMidIndex(array,left,right);
        int tmp=array[left];
        array[left]=array[findMid];
        array[findMid]=tmp;

        //确定中间
        int privo=findmid(array,left,right);

        quicksort(array,left,privo-1);
        quicksort(array,privo+1,right);
    }
    public static int findmid(int[] array,int left,int right){
        int tmp=array[left];
        while(left<right){
            while(left<right&&array[right]>=tmp){
                right--;
            }
            array[left]=array[right];
            while(left<right&&array[left]<=tmp){
                left++;
            }
           array[right]=array[left];
        }
        array[left]=tmp;
        return left;
    }
    public static void insert(int [] array,int left,int right){
        for (int i = left ; i < right ; i++) {
            int tmp=array[i];
            int j=i-1;
            for (; j>=0 ; j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    //找出头和尾和中的中间值和首位交换
    public static int findMidIndex(int[] array,int left,int right){
        int mid=left+((right-left)>>>1);
        if(array[left]>array[mid]&&array[left]<array[right]||
            array[left]>array[mid]&&array[left]<array[right]){
            return left;
        }else if(array[right]>array[left]&&array[right]<array[mid]||
                array[right]<array[left]&&array[right]>array[mid]){
            return right;
        }else {
            return mid;
        }
    }
}
