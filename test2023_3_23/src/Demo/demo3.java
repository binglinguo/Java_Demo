package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 22:15
 **/
public class demo3 {
    public static int fun(){
        try {
            return 1;
        }finally {
            return 2;
        }
    }
    public static void main (String[] args) {
        //System.out.println(fun());
//        String s ;
//        System.out.println(s);
        int x ,y;
        x = 5 >> 2;
        y = x >>>2;
        System.out.println(y);
    }
}
