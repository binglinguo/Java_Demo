package dome1.test;

import java.util.Arrays;
import java.util.Comparator;

//class Student implements Comparable<Student>{
//    public String name;
//    public int age;
//    public double score;
//
//    public Student(String name, int age, double score) {
//        this.name = name;
//        this.age = age;
//        this.score = score;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", score=" + score +
//                '}';
//    }
//
//    //    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public int getAge() {
////        return age;
////    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getScore() {
//        return score;
//    }
//
//    public void setScore(double score) {
//        this.score = score;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }
//
//
////    @Override
////    public int compareTo(Student o){
////        if(this.age>o.age){
////            return 1;
////        }else if(this.age==o.age){
////            return 0;
////        }
////        else return -1;
////    }
//}


class Student {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

class ageComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}

class ScoreComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.score-o2.score);
    }
}


class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class test {

//    public static void main3(String[] args) {
//        Student student1=new Student("s",11,132);
//        Student student2=new Student("s",11,132);
//        System.out.println(student1.compareTo(student2));
//    }

    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("zhangsan",12,45);
        students[1]=new Student("lisi",11,23);
        students[2]=new Student("wangwu",2,12);

        System.out.println(Arrays.toString(students));
        ageComparator ageComparator=new ageComparator();
        NameComparator nameComparator=new NameComparator();
        ScoreComparator scoreComparator=new ScoreComparator();
        Arrays.sort(students,ageComparator);

        System.out.println(Arrays.toString(students));

    }
    public static void main1(String[] args) {
        int[] arr={1,27,38,4,85,66,57};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
