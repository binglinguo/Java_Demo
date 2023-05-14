package LeetCode;

public class Test1 {
    /**
     * 寻找数组的中心下标
     */
    public int pivotIndex(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            num+=nums[i];
        }
        int nums_left=0;
        int nums_right=num;
        for(int i=0;i<nums.length;i++){
            nums_right-=nums[i];
            if(nums_left==nums_right){
                return i;
            }
            nums_left+=nums[i];
        }
        return -1;
    }
    /**
     * 按奇偶排序数组
     * @param nums
     * @return
     */
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            while(i<j && nums[i]%2==0){
                i++;
            }
            while(i<j && nums[j]%2==1){
                j--;
            }
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
        return nums;
    }
}
