package Code;
import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 19:28
 **/
//字符串的全排列
public class demo1 {
    public void swap(char[] str,int i, int j){
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }
    public boolean imExist(ArrayList<String> result,char[] str){
        return result.contains(String.valueOf(str));
    }
    public void PermutationHelper(char[] str,int start,ArrayList<String> result){
        if(start == str.length - 1){
            if(!imExist(result,str)){
                result.add(new String(str));
            }
            return ;
        }
        for( int i = start; i < str.length; i++ ){
            swap(str,start,i);
            PermutationHelper(str,start + 1,result);
            swap(str,start,i);
        }
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if(str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
}
