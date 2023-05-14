package Demo2;

import Demo1.Best;



public class Test1 extends Best {
    public void func(){
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Test1 test1=new Test1();
    }
}
