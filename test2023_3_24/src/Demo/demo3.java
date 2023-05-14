package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 00:26
 **/
public class demo3 {
        public int StrToInt(String str) {
            if(str == null || str.length() == 0){
                return 0;
            }
            int count = 0;
            int n = 1;
            if(str.charAt(0) == '-'){
                n = -n;
            }else if(str.charAt(0) == '+'){
                n = n;
            }
            for(int i = 1; i < str.length() ; i++){
                count *= 10;
                char ch = str.charAt(i) ;
                if(ch >= '0' && ch <='9'){
                    count += ch - '0';
                }else {
                    return 0;
                }
            }
//         if(count == 2147483647){
//             count = -1;
//         }
            //System.out.print(count);
            return count * n;
        }
}
