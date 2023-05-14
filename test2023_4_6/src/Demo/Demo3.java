package Demo;

import java.util.*;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-06 22:17
 **/
//N皇后
class Index{
    public int x;
    public int y;
    public Index(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class Demo3 {
    public void nQueensBacktrack(List<List<Index>> lists,List<Index> list,int cur,int n){
        if(cur == n){
            List<Index> newList = new LinkedList<>();
            for(Index in : list){
                newList.add(in);
            }
            lists.add(newList);
        }
        for(int i = 0;i < n;i++){
            if(isfun(list,cur,i)){//查看是否可以放入
                //如果可以放入 直接拼入 然后进入递归
                list.add(new Index(cur,i));
                nQueensBacktrack(lists,list,cur + 1,n);
                //回溯 删去链表的最后一位
                list.remove(list.size() - 1);
            }
        }
    }
    public boolean isfun(List<Index> list ,int cur,int i){
        //判断是否可以放入这个下标
        for(Index in : list){
            if(in.y == i || cur + i == in.x + in.y || cur - i == in.x - in.y){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<Index>> lists = new LinkedList<>();
        List<Index> list = new LinkedList<>();
        nQueensBacktrack(lists,list,0,n);
        return transList(lists,n);
    }
    public List<List<String>> transList(List<List<Index>> lists, int n){
        List<List<String>> newLists = new LinkedList<>();
        for(List<Index> l : lists){
            List<StringBuilder> list = new LinkedList<>();
            for(int i = 0;i < n; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0;j < n; j++){
                    sb.append('.');
                }
                list.add(sb);
            }
            for(Index in : l){
                list.get(in.x).setCharAt(in.y,'Q');
            }
            List<String> cur = new LinkedList<>();
            for(StringBuilder sb : list){
                cur.add(sb.toString());
            }
            newLists.add(cur);
        }
        return newLists;
    }
}
