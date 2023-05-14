package Demo2;

import java.util.Arrays;

class Solution {
    public int[] sortArray (int[] nums) {

        quickSort(nums,0,nums.length-1);
        return nums;

    }

    public void quickSort (int[] nums, int low, int hight) {

        if (low < hight) {
            int index = partition(nums,low,hight);
            quickSort(nums,low,index-1);
            quickSort(nums,index+1,hight);
        }

    }

    public int partition (int[] nums, int low, int hight) {

        int pivot = nums[low];
        int start = low;

        while (low < hight) {
            while (low < hight && nums[hight] >= pivot) hight--;
            while (low < hight && nums[low] <= pivot) low++;
            if (low >= hight) break;
            swap(nums, low, hight);
        }
        //基准值归位
        swap(nums,start,low);
        return low;
    }
    public void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] elem=new int[]{35,10,42,3,79,12,62,18,51,23};
        System.out.println("排序前");
        System.out.println(Arrays.toString(elem));
        solution.sortArray(elem);
        System.out.println("排序后");
        System.out.println(Arrays.toString(elem));
    }
}
