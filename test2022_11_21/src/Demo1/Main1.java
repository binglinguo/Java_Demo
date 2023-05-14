package Demo1;

public class Main1 {
    public static  boolean containsDuplicate(int[] nums) {
        String str=new String();
        for(int i=0;i<nums.length;i++){
            str+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int ch =str.charAt(i);
            if(str.indexOf(ch)!=str.lastIndexOf(ch)){
                return true;
            }
        }
        return false;
    }
    public static  boolean containsDuplicate1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            int n=nums[i];
            int j=0;
            while(j<nums.length){
                if(n==nums[j]){
                    count++;
                }
                if(count>=2){
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean fly=containsDuplicate(new int[]{1,5,-2,-4,0});
        System.out.println(fly);
    }
    public static void main1(String[] args) {
        String s="SAD";
       // return s.toLowerCase();
    }
}
