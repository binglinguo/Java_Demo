package Sinleton;

/**
 * 懒汉模式
 * 等到要使用了再创建对象
 */
class Sinleton2 {
    private static volatile Sinleton2 instance = null ;
    private Sinleton2(){

    }
    public static Sinleton2 getInstance(){
        if(instance==null){
            synchronized (Sinleton2.class){
                if(instance==null){
                    instance = new Sinleton2();
                }
            }
        }
        return instance;
    }
}
public class demo2 {
}
