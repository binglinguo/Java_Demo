package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-16 21:39
 **/
public class Demo2 {
    static boolean fun(char ch){
        System.out.print(ch);
        return true;
    }

    public static void main (String[] args) {
        int i = 0;
        for(fun('a');fun('b') && i < 2;fun('c')){
            i++;
            fun('d');
        }
    }
}
