package Demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 20:40
 **/
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class Demo7 {
    public int DFS(Map<Integer,Employee> map, int id){
        int sum = map.get(id).importance;
        for(int x : map.get(id).subordinates){
            sum += DFS(map,x);
        }
        return sum;
    }
    public int getImportance(List<Employee> employees, int id) {
        //将这些数据放入哈希表中 Key Value
        Map<Integer,Employee> map = new HashMap<>();
        for(Employee e : employees){
            map.put(e.id,e);
        }
        int ret = DFS(map,id);
        return ret;
    }
}
