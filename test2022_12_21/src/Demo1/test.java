package Demo1;

public class test {
    /**
     * 第一个只出现一次的字母
     */
    public int firstUniqChar(String s) {
        if(s==null)return -1;
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(hash[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
