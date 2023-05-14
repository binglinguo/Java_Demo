package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 00:39
 **/
public class demo5 {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        int i = 0;
        int flag = 1;
        if(str.charAt(i) == '-'){
            flag = -1;
            i++;
        }else if(str.charAt(i) == '+'){
            i++;
        }
        int sum = 0;
        for(; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <='9'){
                sum = sum*10 + (ch - '0');
            }else {
                return 0;
            }
        }
        return sum * flag;
    }
}
