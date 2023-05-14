package Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-16 22:49
 **/
public class demo2 {
    Map<Integer,Integer> map = new HashMap<>();
    public int jumpFloor(int target) {
        if(target == 0){
            return 0;
        }
        if(target <= 2){
            return target;
        }
        int f2 = 0;
        if(map.containsKey(target - 2)){
            f2 = map.get(target - 2);
        }else {
            f2 = jumpFloor(target - 2);
        }
        int f1 = 0;
        if(map.containsKey(target-1)){
            f1 = map.get(target - 1);
        }else {
            f1 = jumpFloor(target - 1);
        }
        return f1 + f2;
    }
}
