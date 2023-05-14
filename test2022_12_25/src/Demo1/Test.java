package Demo1;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    /**
     * 下厨房
     * @param args
     */
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str=in.nextLine();
            String[] strs=str.split(" ");
            for(String s:strs){
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
    /**
     * 输出一个最小的步数变为Fibonacci数"
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            int fib=0;
            int a=1;
            int b=1;
            while(fib<=n){
                fib=a+b;
                a=b;
                b=fib;

            }
            int na=n-a;
            int nb=b-n;
            if(na<nb){
                System.out.println(na);
            }else {
                System.out.println(nb);
            }
        }
    }
}
