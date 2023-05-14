package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 00:35
 **/
public class demo4 {
    public int StrToInt(String str) {
        if(str.isEmpty())return 0;
        int i=0;
        int flag=1;
        if(str.charAt(0)=='-'){
            flag=-1;
            i++;
        }else if(str.charAt(0)=='+'){
            flag=1;
            i++;
        }
        int sum=0;
        for(;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='1'&&ch<='9'){
                sum*=10;
                sum+=ch-'0';
            }else {
                return 0;
            }

        }
        return sum*flag;
    }
}
