package Demo;

import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-04-03 09:42
 **/
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> list = new LinkedList<>();
        boolean flg = true;
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(flg){
                if(str.charAt(i) == ' '){
                    if(s.length() > 0){
                        list.add(s.toString());
                        s = new StringBuilder();
                    }
                    continue;
                }
            }
            if(str.charAt(i) == '\"'){
                flg = !flg;
                if(flg){
                    list.add(s.toString());
                    s = new StringBuilder();
                }
            }else {
                s.append(str.charAt(i));
            }

        }
        if(s.length() > 0){
            list.add(s.toString());
            s = new StringBuilder();
        }
        System.out.println(list.size());
        for(String ret : list){
            System.out.println(ret);
        }
    }
}
