package Sort;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.Arrays;
import java.util.Stack;

/**
 * 快速排序
 */
public class quickSort {
    /**
     * 调用快速排序函数，首先是为了统一接口
     * @param array
     */
    public static void quickSort(int[] array){
       // quick(array,0,array.length-1);
        quickSortMain(array);
    }

    /**
     * 快速排序非递归实现
     */
    public static void quickSortMain(int[] array){
        Stack<Integer> stack=new Stack<>();
        int left=0;
        int right=array.length-1;
        int prior =priorIndex(array,left,right);
        stack.push(left);
        stack.push(right);
        do{
            right=stack.pop();
            left=stack.pop();
            prior =priorIndex(array,left,right);
            if(left<prior-1){
                //如果进入则代表有两个元素以上
                stack.push(left);
                stack.push(prior-1);
            }
            if(prior+1<right){
                stack.push(prior+1);
                stack.push(right);
            }
        }while(!stack.isEmpty());
    }

    /**
     *快速排序内部
     * @param array
     * @param left
     * @param right
     */
    public static void quick(int[] array,int left,int right){
        if(left>=right){
            return ;
        }

        //如果排序的数据小于1400个 那么我们直接使用插入排序来对速度进行优化
        if(right-left+1<=1400){
            insertSort(array,left,right);
        }

        //优化三数取中
        int midIndex= findMidIndex(array,left,right);
        int tmp=array[left];
        array[left]=array[midIndex];
        array[midIndex]=tmp;

        int prior =priorIndex(array,left,right);
        //prior为中间节点
        //if(prior==-1)return ;
        quick(array,left,prior-1);
        quick(array,prior+1,right);
    }

    /**
     * 插入排序，为了优化快排的速度
     * @param array
     * @param left
     * @param right
     */
    public static void insertSort(int[] array,int left,int right){
        for(int i=left;i<right;i++){
            int tmp=array[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if(array[j]>tmp) {
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    /**
     * 修改基数，三数取中法，将比较中部的数字取出可以保证每次递归的两侧都为有效的数据
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int findMidIndex(int[] array,int start,int end){
        int mid=start+((end-start)>>>1);
        //int mid = start + (( start - end ) >>> 1);
        if(array[start]<array[end]){
            if(array[mid]>array[start]){
                return mid;
            }else {
                return start;
            }
        }else {
            if(array[mid]>array[end]){
                return mid;
            }else {
                return end;
            }
        }
    }

    /**
     * 开始使用快排思路进行两边对换，快排关键思路
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int priorIndex(int[] array,int left,int right){
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

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        int[] array={8,6,2,12,18,132165,4561,561,65,16,03,0325,165,16,1,651,56,4112,1,65,156,165,1,65,156,123,1,6541,56,4123,1,321,651,56,1};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
