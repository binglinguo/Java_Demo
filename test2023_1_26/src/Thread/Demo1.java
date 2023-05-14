package Thread;

public class Demo1 {
    public static void main (String[] args) {
        Thread t = new Thread(() ->{

        });
        System.out.println(t.getState());
        t.start();
    }
}
