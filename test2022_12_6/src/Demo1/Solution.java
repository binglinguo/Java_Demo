package Demo1;

import java.util.List;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

/**
 * 员工的重要性
 */
public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        for(Employee e:employees){
            if(e.id==id){
                if(e.subordinates.size()==0){
                    return e.importance;
                }
                for(int x:e.subordinates){
                    e.importance+=getImportance(employees,x);
                }
                return e.importance;
            }
        }
        return 0;
    }
}
