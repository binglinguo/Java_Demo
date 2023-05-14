package Demo1;

import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void quickSort(int[] array) {
        Deque<Integer> stack = new LinkedList<>();
        int left = 0;
        int right = array.length-1;
        stack.push(left);
        stack.push(right);
        while(!stack.isEmpty()){
            right=stack.pop();
            left=stack.pop();
            int pivot = partition(array,left,right);
            if(pivot > left+1) {
                stack.push(left);
                stack.push(pivot-1);
            }
            if(pivot < right-1) {
                stack.push(pivot+1);
                stack.push(right);
            }
        }


    }
    private static int partition(int[] array,int left,int right){
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
        //因left与right相同 所以使用哪个都可以
        array[left]=tmp;
        return right;
    }
    private static int partitionhoare(int[] array,int left,int right){
        int tmp=array[left];
        int tmpIndex=left;
        while(left<right){
            while(left<right && array[right]>=tmp){
                right--;
            }
            while(left<right && array[left]<=tmp){
                left++;
            }
            int t=array[left];
            array[left]=array[right];
            array[right]=t;
        }
        int t=array[tmpIndex];
        array[tmpIndex]=array[left];
        array[left]=t;
        return left;
    }
}
