package Sort;

import java.util.Stack;

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
       //quickSoat(array,0,array.length-1);
        //非递归
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        stack.push(array.length-1);
        while(!stack.isEmpty()){
            int right=stack.pop();
            int left=stack.pop();
            int privo=findIndex(array,left,right);
            if(privo<right-1){
                stack.push(privo+1);
                stack.push(right);
            }
            if(privo>left+1){
                stack.push(left);
                stack.push(privo-1);
            }
        }
    }

    public static void quickSoat(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        //优化1 当数字较少使用插入排序
        if(right-left+1<=5){
            insert(array,left,right);
            return ;
        }
        //优化2 三数区中
        int MidIndex=findMidIndex(array,left,right);
        if(MidIndex!=left){
            int t=array[left];
            array[left]=array[MidIndex];
            array[MidIndex]=t;
        }
        int privo=findIndex(array,left,right);

        quickSoat(array,left,privo-1);
        quickSoat(array,privo+1,right);
    }

    //插入排序
    public static void insert(int[] array,int left,int right){
        for (int i = left + 1 ; i <= right ; i++) {
            int t=array[i];
            int j=i-1;
            for (; j>=0; j--){
                if(array[j]>t){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=t;
        }
    }

    //三数取中
    public static int findMidIndex(int[] array,int left,int right){
        int mid=left+((right-left)>>>1);
        if(array[right]>array[mid] && array[right]<array[left]||
           array[right]<array[mid] && array[right]>array[left]){
            return right;
        }else if(array[left]<array[mid] && array[left]>array[right]||
                 array[left]>array[mid] && array[left]<array[right]){
            return left;
        }else{
            return mid;
        }
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
