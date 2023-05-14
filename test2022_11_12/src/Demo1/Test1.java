package Demo1;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        s=s.toUpperCase();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'||s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                str.append(s.charAt(i));
            }
        }
        int head=0;
        int last=str.length()-1;
        while(head<last){
            if(str.charAt(last)!=str.charAt(head)){
                return false;
            }
            last--;
            head++;
        }
        return true;
    }


}
