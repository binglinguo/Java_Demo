package Demo1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 23:00
 **/
//无重叠区间
public class Demo9 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if( n == 0 ){
            return 0;
        }
        Arrays.sort(intervals , new Comparator<int[]>() {
            @Override
            public int compare (int[] o1 , int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int s = 1;
        int right = intervals[0][1];
        for(int i = 1;i < intervals.length; i++){
            if(intervals[i][0] >= right){
                s++;
                right = intervals[i][1];
            }
        }
        return n - s;
    }
}
