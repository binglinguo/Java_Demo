package Demo1;

interface IUSB{
    void openDevice();//开启
    void closeDevice();//关闭
}

class Animal{

}
class Dog extends Animal{

}
class hsDog extends Dog{

}
class bsDog extends Dog{

}

//    public void open(){
//        System.out.println("开机！");
//    }
//
//    public void close(){
//        System.out.println("关机");
//    }

//    public void useDevice(IUSB iusb){
//        iusb.openDevice();
//        if (iusb instanceof Mouse){
////            ((Mouse) iusb).click();
//            Mouse mouse = (Mouse)iusb;//不安全的
//            IUSB a=mouse;
//            //mouse.click();
//        }else if (iusb instanceof KeyBoard){
//            KeyBoard keyBoard = (KeyBoard) iusb;
//            keyBoard.input();
//        }
//        iusb.closeDevice();
//    }
//}

class Mouse implements IUSB{//鼠标类

    @Override
    public void openDevice() {
        System.out.println("开启鼠标");
    }



    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }
}


public class Test {
    public static void main(String[] args) {

    }
}
