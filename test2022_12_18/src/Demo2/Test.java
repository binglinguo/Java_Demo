package Demo2;

public class Test {
    public static void main (String[] args) {
        String str=new String("1~1_0000的数字有：");
        long time=System.currentTimeMillis();
        for (int i = 1 ; i <= 1_0000 ; i++) {
            str+=i;
        }
        long lasttime=System.currentTimeMillis();
        System.out.println(lasttime-time);

    }
}
