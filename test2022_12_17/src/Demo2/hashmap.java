package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("abc",2);
        map.put("bit",4);
        map.put("hello",3);
        System.out.println(map);
        Set<String> set=map.keySet();
        System.out.println(set);
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
//        System.out.println(map.get("sad"));//通过key来获取value值
//        System.out.println(map.get("abc"));
//        map.put("abc",2);
//        System.out.println(map.get("abc"));
//        System.out.println(map.getOrDefault("abc",100));

    }
}
