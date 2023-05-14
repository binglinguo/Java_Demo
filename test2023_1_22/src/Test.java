import java.util.HashSet;

public class Test {
    /**
     * 仅仅反转字母
     * @param s
     * @return
     */
    public String reverseOnlyLetters(String s) {
        StringBuilder str=new StringBuilder();
        str.append(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')){
                i++;
            }
            while(i<j && !(str.charAt(j)>='a'&&str.charAt(j)<='z'||str.charAt(j)>='A'&&str.charAt(j)<='Z')){
                j--;
            }
            char t=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,t);
            i++;
            j--;

        }
        return str.toString();
    }
    /**
     * 存在重复元素
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main1 (String[] args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s.equals(c));
    }
}
