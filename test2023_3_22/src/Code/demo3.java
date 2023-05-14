package Code;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 19:54
 **/
public class demo3 {
    public static void main (String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(4 , new Comparator<Integer>() {
            @Override
            public int compare (Integer o1 , Integer o2) {
                return 0;
            }
        });
    }
}
