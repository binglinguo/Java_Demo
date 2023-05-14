package Demo2;
import java.util.Arrays;

class Students implements Comparable<Students>{
    public String name;
    public int age;
    public double score;

    //构造方法
    public Students(String name,int age,double score){
        this.name=name;
        this.age=age;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

//    @Override
//    public int compareTo(Students o) {
//        //按照年龄排序
//        return this.age-o.age;
//    }


    @Override
    public int compareTo(Students o) {
        if(this.name.compareTo(o.name)>0) {
            return 1;
        }
        else if(this.name.compareTo(o.name)<0){
            return -1;
        }else {
            return 0;
        }
    }
}

public class Test {
    //实现一个类排序
    public static void main(String[] args) {
        Students[] students=new Students[3];
        students[0]=new Students("zhangsan",12,56.3);
        students[1]=new Students("lisi",15,95.2);
        students[2]=new Students("wangwu",10,44.4);
        Arrays.sort(students);
        for (Students s:students) {
            System.out.println(s);
        }
    }
    //首先实现一个数组的排序
    public static void main1(String[] args) {
        int[] arr={1,3,2,5,2,4,6,9,5,2,1,2,3,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
