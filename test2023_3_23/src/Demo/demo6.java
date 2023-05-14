package Demo;

import java.util.ArrayList;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 23:13
 **/
//和为S的连续子序列
public class demo6 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (sum == 0) {
            return lists;
        }
        int i = 1;
        int j = 2;
        int num = i + j;
        while (i < j) {
            ArrayList<Integer> list = new ArrayList<>();
            if (num == sum) {
                for (int k = i; k <= j; k++) {
                    list.add(k);
                }
                lists.add(list);
                j++;
                num += j;
            } else if (num < sum) {
                j++;
                num += j;
            } else {
                i++;
                num -= i - 1;
            }
        }
        return lists;
    }
}
