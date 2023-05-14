package Demo;

import java.util.*;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 23:05
 **/
public class demo8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String[] strs = new String[n];
            for(int i = 0;i < n; i++){
                strs[i] = scanner.nextLine();
            }
            PriorityQueue<String> EngilshHeap = new PriorityQueue<>(new Comparator<String>() {
                @Override
                public int compare (String o1 , String o2) {
                    return o1.charAt(0) - o2.charAt(0);
                }
            });
            PriorityQueue<String> LengthHeap = new PriorityQueue<>(new Comparator<String>() {
                @Override
                public int compare (String o1 , String o2) {
                    return o1.length() - o2.length();
                }
            });
            for (String s  : strs) {
                EngilshHeap.offer(s);
                LengthHeap.offer(s);
            }
            while(!EngilshHeap.isEmpty() && !LengthHeap.isEmpty()){
                if(!EngilshHeap.poll().equals(LengthHeap.poll())){
                    break;
                }
            }
            System.out.println(EngilshHeap.isEmpty() && LengthHeap.isEmpty());
        }
    }
}
