package com.gbl.dome.po;

public class PreakPo {

    String name;
    int age;

    public  PreakPo(){
        ;
    }
    //    public Preak(String name,int age){
//       w this.name=name;
//        this.age=age;
//
//    }
//    }
    static {
        System.out.println("静态方法初始化");
    }

    public PreakPo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法初始化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Preak{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

