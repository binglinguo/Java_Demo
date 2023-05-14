package Demo2;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
    /**
     * 0-n-1中没有出现的数字
     */
    public int missingNumber(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=m){
                return m;
            }
            m++;
        }
        return m;
    }
    /**
     * 排序数组中查找数字
     * @param nums
     * @param target
     * @return
     */
    //优化
    public int search(int[] nums, int target) {
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)>>>1;
            if(nums[mid]>=target){
                right=mid;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
        }
        while(left<nums.length&&nums[left]==target){
            count++;
            left++;
        }
        return count;
    }
    public int search2(int[] nums, int target) {
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)>>>1;
            if(nums[mid]==target){
                break;
            }
            if(nums[mid]>target){
                right=mid;
            }
            if(nums[mid]<target){
                left=mid+1;
            }

        }
        /**
         缩小范围了
         */
        for(int i=left;i<=right;i++){
            if(nums[i]==target){
                count++;
            }
        }
        return count;
    }
    public int search1(int[] nums, int target) {
        if(nums.length==0)return 0;
        int count=0;
        int i=0;
        int j=nums.length-1;
        int mid=0;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                break;
            }else if(nums[mid]>target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        int r=mid-1;
        while(r>=0 && nums[r]==target){
            count++;
            r--;
        }
        while(mid<nums.length && nums[mid]==target){
            count++;
            mid++;
        }
        return count;
    }
    /**
     * 数组中重复的数字
     * @param nums
     * @return
     */
    //解法2
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            if(!set.add(x)){
                return x;
            }
        }
        return -1;
    }
    public int findRepeatNumber1(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0 ; i < nums.length ; i++) {
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
    /**
     * 左旋转字符串
     */
    public String reverseLeftWords(String s, int n) {
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        StringBuilder strlast=
                new StringBuilder(str.substring(s.length()-(n%s.length()),s.length()));
        strlast.reverse();
        StringBuilder strhead=
                new StringBuilder(str.substring(0,s.length()-(n%s.length())));
        strhead.reverse();
        StringBuilder s1=new StringBuilder();
        s1.append(strhead);
        s1.append(strlast);
        return s1.toString();
    }
    /**
     * 替换空格
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     */
    public String replaceSpace(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                str.append(s.charAt(i));
            }else {
                str.append("%20");
            }
        }
        return str.toString();
    }
}
