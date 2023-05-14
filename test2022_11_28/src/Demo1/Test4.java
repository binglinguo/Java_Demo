package Demo1;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list=new ArrayList<>();
            List<Integer> ret=new ArrayList<>();
            list.add(ret);
            ret.add(1);
            for(int i=1;i<numRows;i++){
                List<Integer> prev=list.get(i-1);
                List<Integer> tmp=new ArrayList<>();
                tmp.add(1);

                for(int j=1;j<i;j++){
                    int a=prev.get(j)+prev.get(j-1);
                    tmp.add(a);
                }
                tmp.add(1);
                list.add(tmp);
            }
            return list;
        }

    class Solution {
        public int removeDuplicates(int[] nums) {
            int j=0;
            for(int i=1;i<nums.length;i++){
                if(nums[j]!=nums[i]){
                    nums[j+1]=nums[i];
                    j++;
                }
            }
            return j+1;
        }
    }
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j=nums1.length-1;
            int nums1n=m-1;
            int nums2n=n-1;
            while(nums1n>=0&&nums2n>=0){
                if(nums1[nums1n]>=nums2[nums2n]){
                    nums1[j]=nums1[nums1n];
                    j--;
                    nums1n--;
                }else {
                    nums1[j]=nums2[nums2n];
                    j--;
                    nums2n--;
                }
            }
            while(nums1n>=0&&j>=0){
                nums1[j]=nums1[nums1n];
                j--;
                nums1n--;
            }
            while(nums2n>=0&&j>=0){
                nums1[j]=nums2[nums2n];
                j--;
                nums2n--;
            }

        }
}
