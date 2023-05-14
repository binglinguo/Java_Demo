package Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 18:18
 **/
//组合总和
public class Demo4 {
    public void DFS(int[] can, List<List<Integer>> lists, List<Integer> list,
                    int sum, int index, int target)  {
        if(sum >= target){
            if(sum == target){
                lists.add(new ArrayList<>(list));
            }
            return ;
        }
        for(int i = index;i < can.length;i++){
            list.add(can[i]);
            DFS(can,lists,list,sum + can[i], i , target);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        DFS(candidates,lists,new ArrayList<>(),0,0,target);
        return lists;
    }
}
