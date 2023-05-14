package Sinleton;

/**
 * 完全体的线程安全单例模式
 * 1.在合适的地方加锁
 * 2.双重if判定
 * 3.使用volatile
 */
class Somleton3{
    private static volatile Somleton3 instance = null;
    private Somleton3(){

    }
    public static Somleton3 getInstance (){
        if(instance == null){
            synchronized(Somleton3.class){
                if(instance==null){
                    instance=new Somleton3();
                }
            }
        }
        return instance;
    }
}
public class Demo3 {

}
