package Demo1;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 14:44
 **/
public class demo2 {
    public static void main (String[] args) throws InterruptedException {
//        StringBuffer str = new StringBuffer();
        StringBuilder str = new StringBuilder();
        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run () {
                for (char i = 0 ; i < 100 ; i+=(char) (1)) {
                    str.append(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run () {
                for (char i = 0 ; i < 100 ; i+=(char) (1)) {
                    str.append(i);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(str);
    }
}
