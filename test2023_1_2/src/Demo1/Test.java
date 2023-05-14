package Demo1;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
    /**
     * 搜索插入位置
     */
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+((right-left)>>>1);
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    /**
     * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
     */
/*    public int firstBadVersion(int n) {
        int left=0;
        int right=n;

        while(left<right){
            int mid=left+((right-left)/2);
            if(isBadVersion(mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }*/
    /**
     * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
     */
    public static int[] findNumberAppearOnce(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int[] array=new int[2];
        int k=0;
        for (int i =  0 ; k<=1 &&i < arr.length ; i++) {
            if(map.get(arr[i])==1){
                array[k++]=arr[i];
            }
        }
        return array;
    }

    public static void main (String[] args) {
        int[] arr={1,3,1,2,3,7};
        int[] array=findNumberAppearOnce(arr);
        System.out.println(Arrays.toString(array));
    }
    /**
     * 如何判断一个数是否是2的k次方？这里不需要确定k的值
     * @param n
     * @return
     */
    public static boolean isPower(int n){
        if(n<=0)return false;
        int count=0;
        int i=0;
        while(n>>i>0){
            if(((n>>i)&1)==1){
                count++;
            }
            i++;
        }
        return count==1;
    }

    public static void main1 (String[] args) {
        System.out.println(isPower(2));
    }
}
