package Demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution3{
    public  void radixSort(int[] data) {
        int maxBin = maxBin(data);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0, factor = 1; i < maxBin; factor *= 10, i++) {
            for (int j = 0; j < data.length; j++) {
                list.get((data[j] / factor) % 10).add(data[j]);
            }
            for (int j = 0, k = 0; j < list.size(); j++) {
                while (!list.get(j).isEmpty()) {
                    data[k] = list.get(j).get(0);
                    list.get(j).remove(0);
                    k++;
                }
            }
        }
    }

    //计算数组里元素的最大位数
    public  int maxBin(int[] data) {
        int maxLen = 0;
        for (int i = 0; i < data.length; i++) {
            int size = Integer.toString(data[i]).length();
            maxLen = size > maxLen ? size : maxLen;
        }
        return maxLen;
    }

}
public class Main3 {
    public static void main(String[] args) {
        Solution3 solution=new Solution3();
        int[] elem=new int[]{59,95,7,34,60,168,171,259,372,45,88,133};
        System.out.println("排序前");
        System.out.println(Arrays.toString(elem));
        solution.radixSort(elem);
        System.out.println("排序后");
        System.out.println(Arrays.toString(elem));
    }


}
