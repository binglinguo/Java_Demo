package Demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 19:45
 **/
//活字印刷
public class Deno5 {
    public void DFS(String tiles,Set<String> set,StringBuilder str,int[] book){
        if(str.length() != 0){
            set.add(str.toString());
        }
        for(int i = 0;i < tiles.length();i++){
            if(book[i] == 1){
                continue;
            }
            book[i] = 1;
            DFS(tiles,set,str.append(tiles.charAt(i)),book);
            book[i] = 0;
            str.deleteCharAt(str.length() - 1);
        }
    }
    public int numTilePossibilities(String tiles) {
        if(tiles == null){
            return 0;
        }
        Set<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        int[] book = new int[tiles.length()];
        DFS(tiles,set,str,book);
        return set.size();
    }
}
