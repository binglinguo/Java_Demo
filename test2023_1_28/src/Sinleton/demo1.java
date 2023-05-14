package Sinleton;

/**
 * 饿汉模式
 * 迫不及待的创建对象
 */
class Sinleton{
    private static Sinleton instance = new Sinleton();
    private Sinleton(){

    }
    public static Sinleton getInstance(){
        return instance;
    }
}
public class demo1 {
    public static void main (String[] args) {
        Sinleton instance = Sinleton.getInstance();
    }
}
