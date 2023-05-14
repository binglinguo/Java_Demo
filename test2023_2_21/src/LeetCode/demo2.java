package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-21 23:06
 **/
//棒球比赛
public class demo2 {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (String s : operations) {
            int n = list.size();
            switch (s.charAt(0)) {
                case 'D':
                    num += 2 * list.get(n - 1);
                    list.add(2 * list.get(n - 1));
                    break;
                case '+':
                    num += list.get(n - 1) + list.get(n - 2);
                    list.add(list.get(n - 1) + list.get(n - 2));
                    break;
                case 'C':
                    num -= list.get(n - 1);
                    list.remove(n - 1);
                    break;
                default:
                    num += Integer.parseInt(s);
                    list.add(Integer.parseInt(s));
                    break;
            }
        }
        return num;
    }
}
//error
//    public int calPoints(String[] operations) {
//        List<Integer> list = new ArrayList<>();
//        int num = 0;
//        for(int i = 0 ;i < operations.length ;i++){
//            String s = operations[i];
//            if(s.equals("+")){
//                if(i >= 2){
//                    list.add(list.get(i-1)+list.get(i-2));
//                }//else if( i == 1){
////                    list.add(list.get(i-1));
////                }
//                num += list.get(i);
//            }else if(s.equals("d")||s.equals("D")){
//                list.add(list.get(i-1)*2);
//                num += list.get(i);
//            }else if(s.equals("C")||s.equals("c")){
//                int ret = list.get(i-1);
//                list.remove(i-1);
//                num -= ret;
//            }else {
//                list.add(Integer.parseInt(s));
//                num += list.get(i);
//            }
//        }
//        return num;
//    }
//}
//        for (String s : operations) {
//            if(s.equals("+")){
//
//            }else if(s.equals("d")||s.equals("D")){
//                stack.push(stack.peek()*2);
//                num += stack.peek();
//            }else if(s.equals("C")||s.equals("c")){
//                int ret = stack.pop();
//                num -= ret;
//            }else {
//                stack.push(Integer.parseInt(s));
//                num += stack.peek();
//            }