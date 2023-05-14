package Demo3;

import java.util.Scanner;

public class Test3 {
    public static boolean ishuifen(int x){
        if(x%10==x/10000&&x/10%10==x/1000%10){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println(ishuifen(x));
    }
}
