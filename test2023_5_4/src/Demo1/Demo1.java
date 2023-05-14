package Demo1;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-04 21:54
 **/
public class Demo1 {
    // write your code here
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                float none = method(n);
                float res = none/factorial(n)*100;
                System.out.println(String.format("%.2f",res) + "%");
            }
        }

        /**
         * 动态规划错排问题
         * @param n
         * @return
         */
        public static float function(int n) {
            float[] dp = new float[n+1];
            dp[0] = 0;
            dp[1] = 0;
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i] = (i-1) * (dp[i-1] + dp[i-2]);
            }
            return dp[n];
        }
        /**
         * 递归错排问题
         * @param n
         * @return
         */
        public static float method(int n) {
            if (n == 1) {
                return 0;
            }else if (n == 2) {
                return 1;
            }
            return (n-1) * (method(n-1) + method(n-2));
        }

        /**
         * 递归求阶乘
         * @param n
         * @return
         */
        public static float factorial(int n) {
            if (n == 1) return 1;
            return n * factorial(n-1);
        }

        /**
         * 非递归求阶乘
         * @param n
         * @return
         */
        public static float factorialI(int n) {
            int res = 1;
            while (n > 1) {
                res *= n;
                n--;
            }
            return res;
        }

}
