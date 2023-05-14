package Demo;

public class Test {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash=new int[125];
        for(int i=0;i<magazine.length();i++){
            hash[magazine.charAt(i)]++;
        }
        for(int j=0;j<ransomNote.length();j++){
            hash[ransomNote.charAt(j)]--;
            if(hash[ransomNote.charAt(j)]<0){
                return false;
            }
        }
        return true;
    }
}
