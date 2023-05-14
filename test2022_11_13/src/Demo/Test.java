package Demo;

public class Test {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.add(1, 2));
        System.out.println(test.add(1, 2, 3));
    }
}
