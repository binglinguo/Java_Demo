package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:28
 **/
//不使用任何加减乘除运算符号实现A+B
public class Demo4 {
    public static int addAB(int A, int B) {
        // write code here
        //return B == 0 ? A : addAB(A ^ B,(A & B) << 1);
        if (B == 0) {
            return A;
        }
        int c = A ^ B;
        int d = (A & B);
        return addAB(c , d << 1);
    }

    public static void main (String[] args) {
        int a = 3;
        int b = 1;
        int n = addAB(a,b);
        System.out.println(n);
    }
}
