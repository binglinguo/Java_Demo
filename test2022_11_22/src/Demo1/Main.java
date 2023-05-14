package Demo1;

import java.util.Arrays;

public class Main  {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str=new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<strs[i].length()&&j<str.length();j++){
                if(strs[i].charAt(j)!=str.charAt(j)){
                    str.delete(j,str.length());
                    break;
                }
            }
            if(str.length()>strs[i].length()){
                str.delete(strs[i].length(),str.length());
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s=longestCommonPrefix(new String[]{"ab", "a"});
        System.out.println(s);
    }
    public static void main3(String[] args) {
        String s=new String();
        //s.charAt()
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=0;
        int a=x;
        while(a>0){
            n*=10;
            n+=a%10;
            a/=10;
        }
        if(n==x){
            return true;
        }else {
            return false;
        }
    }
    public static void main2(String[] args) {
        //StringBuffer
    }
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] arr={0,0};
        for(i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }return null;
    }
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=0;
            int j=0;
            for(i=0;i<nums1.length;i++){
                if(nums1[i]==0){
                    nums1[i]=nums2[j];
                    j++;
                }
                if(j==nums2.length){
                    break;
                }
            }
            Arrays.sort(nums1);
        }
    public static void main1(String[] args)  {
        int [] a=new int[10];//定义数组
        Arrays.fill(a,2021);//赋值。实际上也可以用for循环赋值，都是一样的
        for(int i=1;i<1000000;i++) {//暴力
            int x=i;//中间值
            while(x!=0) {//while循环
                int t=x%10;//取余
                if(a[t]>0) {//进行减小卡牌
                    a[t]--;
                }
                else {//输出
                    System.out.println(i-1);
                    return ;//这里输出之后，程序就结束了，别用break，break只是停止while循环。直接用return。
                }
                x=x/10;//x要去掉尾部
            }
        }
    }

}
