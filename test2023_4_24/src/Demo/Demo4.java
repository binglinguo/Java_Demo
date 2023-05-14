package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-24 23:59
 **/
public class Demo4 {
    public static void main (String[] args) {
        int a = 1;
        int b = 1;
        for(int i = 0;i < 100; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c % 100000 + " ");
        }
    }
}
