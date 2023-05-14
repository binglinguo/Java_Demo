package Demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-03 22:48
 **/
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class Demo3 {
    public int DFS(Map<Integer,Employee> map, int id){
        if(map.isEmpty()){
            return 0;
        }
        Employee emp = map.get(id);
        int sum = emp.importance;
        for(int curId : emp.subordinates){
            sum += DFS(map,curId);
        }
        return sum;
    }
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap<>();
        for(Employee e : employees){
            map.put(e.id,e);
        }
        //将其存入一个哈希表中方便查找
        return DFS(map,id);
    }
}
