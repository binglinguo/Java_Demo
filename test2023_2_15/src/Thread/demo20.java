package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 23:10
 **/
//实现单例模式 懒汉模式
class Singletom2{
    //设置为private类型 防止被直接获取到对象
    private static Singletom2 letom = null;
    //将构造方法设置为private 保证只会有单一的实例
    private Singletom2(){};
    public static Singletom2 getLetom(){
        if(letom ==null){
            synchronized(Singletom2.class){
                letom = new Singletom2();
            }
        }
        return letom;
    }
}
public class demo20 {
    public static void main (String[] args) {
        Singletom2 letom = Singletom2.getLetom();
        System.out.println(letom);
    }
}
