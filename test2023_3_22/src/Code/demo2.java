package Code;
import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 19:42
 **/
//字符串的全排列 自己写的~
public class demo2 {
    private void swap(char[] array,int i, int j){
        char t  = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private boolean isExcept(char[] array,ArrayList<String> list){
        return list.contains(String.valueOf(array));
    }
    public void PermutationHelper(char[] array,int tail,ArrayList<String> list){
        if(tail == array.length - 1){
            if(!isExcept(array,list)){
                list.add(new String(array));
            }
            return ;
        }
        for( int i = tail + 1; i < array.length; i++){
            swap(array,i,tail);
            PermutationHelper(array,tail+1,list);
            swap(array,i,tail);
        }
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if(str != null && str.length() >= 1){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }else if(str.length() == 0){
            list.add(new String(str));
        }
        return list;
    }

    public static void main (String[] args) {
        long time = System.currentTimeMillis();
        String str = "qwertyuio";
        demo2 d2 = new demo2();
        ArrayList<String> list = d2.Permutation(str);
        for (String s : list) {
            System.out.println(s);
        }
        long timelast = System.currentTimeMillis();
        System.out.println("使用时间"+ (timelast - time));
    }
}
