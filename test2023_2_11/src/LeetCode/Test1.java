package LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-11 21:29
 **/
class student{
    public int age;
}
public class Test1 {
    public static void main (String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>(){

            @Override
            public int compare (student o1 , student o2) {
                return o1.age - o2.age;
            }
        });
    }
}
