package test;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-11 20:08
 **/

class People1{
    int height;
    String ear;
    void speak(String s) {
    }
}
public class people {
    public static void main(String[] args){
        People1 zhubajie = null;
        zhubajie = new People1();
        zhubajie.height = 170;
        zhubajie.ear = "两只大耳朵";
        System.out.println("身高:" + zhubajie.height);
        System.out.println(zhubajie.ear);
        zhubajie.speak("师傅,咱们别去西天了,改去月宫吧");
    }
}
