package Demo1;

public class Test {
    /**
     * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        int count=0;
        for(int i=0;i<arr[arr.length-1].length();i++){
            count++;
            if(arr[arr.length-1].charAt(i)==' '){
                break;
            }
        }
        return count;
    }

    /**
     * 搜索插入的位置
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
//        int i=0;
//        int j=nums.length-1;
//        if(nums[0]>target){
//            return 0;
//        }
//        if(nums[j]<target){
//            return j+1;
//        }
//        while(i<j){
//            int mid=(i+j)/2;
//            if(target==nums[mid]||target>nums[mid-1]&&target<nums[mid+1]){
//                return mid;
//            }
//            if(target<nums[mid]){
//                j=mid-1;
//            }
//            if(target>nums[mid]){
//                i=mid+1;
//            }
//        }
//        return -1;
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]<target){
                i=mid+1;
            }else {
                j=mid-1;
            }

        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,4,5,6,7,8};
        int i=searchInsert(nums,6);
        System.out.println(i);
    }
}
