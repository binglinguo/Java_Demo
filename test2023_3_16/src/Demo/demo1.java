package Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-16 22:36
 **/
//斐波那契数列剪枝
public class demo1 {
    Map<Integer,Integer> map = new HashMap<>();
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n <= 2){
            return 1;
        }
        int f2 = 0;
        if(map.containsKey(n-2)){
            f2 = map.get(n-2);
        }else {
            f2 = Fibonacci(n-2);
        }
        int f1  = 0;
        if(map.containsKey(n-1)){
            f1 = map.get(n-1);
        }else {
            f1 = Fibonacci(n-1);
        }
        return f1 + f2;
    }
}
