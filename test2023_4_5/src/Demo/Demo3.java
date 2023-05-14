package Demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 17:29
 **/
//电话号码的字母组合
public class Demo3 {
    private String[] strs = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void DFS(String digits,List<String> list,StringBuilder s,int index){
        if(index == digits.length()){
            if(s.length() == 0){
                return ;
            }
            list.add(s.toString());
            return ;
        }
        int n = digits.charAt(index);
        String table = strs[n - '0'];
        for(int i = 0;i < table.length();i++){
            DFS(digits,list,s.append(table.charAt(i)),index + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        StringBuilder s = new StringBuilder();
        DFS(digits,list,s,0);
        return list;
    }

    public static void main (String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.letterCombinations("23");
    }
}
