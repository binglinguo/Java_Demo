package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-17 21:10
 **/
public class Demo1 {
    public static void main (String[] args) {
        String s1 = "he" + "llo";
        String s2 = new String(s1);
        if(s1.equals(s2)){
            System.out.println("equals");
        }
        if(s1 == s2){
            System.out.println("==");
        }
    }
}
