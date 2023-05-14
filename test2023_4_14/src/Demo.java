/**
 * @Author: 冰激凌
 * @Date: 2023-04-14 21:50
 **/
public class Demo {
        public int findMinimum(int n, int[] left, int[] right) {
            // write code here
            int leftSum = 0;
            int rightSum = 0;
            int sum = 0;
            int leftMin = Integer.MAX_VALUE;
            int rightMin = Integer.MAX_VALUE;
            for(int i = 0;i < n; i++ ){
                if(left[i] * right[i] == 0){
                    sum += left[i] + right[i];
                }else {
                    leftSum += left[i];
                    rightSum += right[i];
                    leftMin = Math.min(leftMin,left[i]);
                    rightMin = Math.min(rightMin,right[i]);
                }
            }
            int count = Math.min(leftSum - leftMin + 1,rightSum - rightMin + 1) + 1 + sum;
            return count;
        }
    }
}
