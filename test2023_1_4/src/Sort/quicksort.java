package Sort;

import java.util.Arrays;
import java.util.Stack;

public class quicksort implements Sort{
    /**
     * 快速排序
     * 时间复杂度O(N*log2^N)
     * 空间复杂度O(N)
     * wendx：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        //quicksort(array,0,array.length-1);
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

    public static void quicksort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        if(right-left+1<=5){
            insert(array,left,right);
            return ;
        }

        int midIndex=findMidIndex(array,left,right);
        if(midIndex!=left){
            int tmp=array[left];
            array[left]=array[midIndex];
            array[midIndex]=tmp;
        }
        int privo=findIndex(array,left,right);

        quicksort(array,left,privo-1);
        quicksort(array,privo+1,right);
    }

    public static int findMidIndex(int[] array,int left,int right){
        int mid=left+((right-left)>>>1);
        if(array[left]>array[mid]&&array[left]<array[right]||
           array[left]<array[mid]&&array[left]>array[right]){
            return left;
        }else if(array[right]<array[mid]&&array[right]>array[left]||
                 array[right]>array[mid]&&array[right]<array[left]){
            return right;
        }else {
            return mid;
        }
    }

    public static void insert(int[] array,int left,int right){
        for (int i = left+1 ; i <= right ; i++) {
            int t=array[i];
            int j=i-1;
            for (;j>=0;j--){
                if(array[j]>t){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=t;
        }
    }

    public static int findIndex(int[] array,int left,int right){
        int tmp=array[left];
        while(left<right){
            while(left<right&&array[right]>tmp){
                right--;
            }
            array[left]=array[right];
            while(left<right&&array[left]<tmp){
                left++;
            }
            array[right]=array[left];
        }
        array[right]=tmp;
        return left;
    }
}
