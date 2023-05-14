package Demo1;

import java.util.*;

class student /*implements Comparable<student>*/{
    public int id;
    public String name;

    public student(int id,String name){
        this.name=name;
        this.id=id;
    }

    public int getid(){
        return this.id;
    }


//    @Override
//    public int compareTo (student o) {
//        return this.id-o.id;
//    }
}

class idCompare implements Comparator<student> {
    @Override
    public int compare (student o1 , student o2) {
        return o1.id-o2.id;
    }
}

public class Test1 {
    public static void main (String[] args) {
        List<student> list=new LinkedList<>();
        list.add(new student(2,"lisi"));
        list.add(new student(1,"zhangsan"));
        Collections.sort(list,new idCompare());
        //Collections.sort(list);
        for (student s :list ) {
            System.out.println(s.id+"  "+s.name);
        }

    }
}
