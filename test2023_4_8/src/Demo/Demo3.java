package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 12:56
 **/
public class Demo3 {
    public static void main(String[] args) {
        int count = 0;
        long num = 1;
        while (count < 2023) {
            if (isHarshad(num)) {
                count++;
            }
            num++;
        }
        System.out.println(num - 1);
    }

    private static boolean isHarshad(long num) {
        long sum = 0;
        for (char c : String.valueOf(num).toCharArray()) {
            sum += c - '0';
        }
        return num % sum == 0;
    }
}
