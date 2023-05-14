package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 23:07
 **/
class Singletom{
    public static Singletom leton = new Singletom();
    private Singletom(){

    }
    public static Singletom getInstance(){
        return leton;
    }
}
public class demo19 {
    public static void main (String[] args) {
        System.out.println(Singletom.getInstance());
    }
}
