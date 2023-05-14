package Demo2;

import java.util.Arrays;

class Solution1 {
    public int[] sortArray(int[] nums) {

        int len = nums.length;
        int[] a = new int[len + 1];

        for (int i = 0; i < nums.length; ++i) {
            a[i+1] = nums[i];
        }
        //下沉建堆
        for (int i = len/2; i >= 1; --i) {
            sink(a,i,len);
        }

        int k = len;
        //排序
        while (k > 1) {
            swap(a,1,k--);
            sink(a,1,k);
        }
        for (int i = 1; i < len+1; ++i) {
            nums[i-1] = a[i];
        }
        return nums;
    }
    public void sink (int[] nums, int k,int end) {
        //下沉
        while (2 * k <= end) {
            int j = 2 * k;
            //找出子节点中最大或最小的那个
            if (j + 1 <= end && nums[j + 1] > nums[j]) {
                j++;
            }
            if (nums[j] > nums[k]) {
                swap(nums, j, k);
            } else {
                break;
            }
            k = j;
        }
    }
    public void swap (int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
public class Main2 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] elem=new int[]{34,19,40,14,57,17,4,43};
        System.out.println("排序前");
        System.out.println(Arrays.toString(elem));
        solution.sortArray(elem);
        System.out.println("排序后");
        System.out.println(Arrays.toString(elem));
    }
}
