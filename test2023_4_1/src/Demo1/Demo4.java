package Demo1;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 19:04
 **/
//分割平衡字符串
public class Demo4 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < s.length() ;i++){
            if(s.charAt(i) == 'R'){
                sum--;
            }else {
                sum++;
            }
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}
