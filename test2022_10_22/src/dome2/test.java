package dome2;



/**
 * 接口
 */
interface IShape{
    public abstract void draw();

    default public void fun(){
        System.out.println("hehi");
    }
}

//通过implements来(继承)实现接口之间的关系
class B implements IShape{
    @Override
    public void draw(){
        System.out.println("♣");
    }

}

class Rect implements IShape{
    @Override
    public void draw(){
        System.out.println("♦");
    }
}

class Triangle implements IShape {
    @Override
    public void draw(){
        System.out.println("△");
    }
}

class Tycle implements IShape{
    @Override
    public void draw(){
        System.out.println("●");
    }
}

public class test {

    public static void shapeMap(IShape ishape){
        ishape.draw();
    }

    public static void main(String[] args) {
        IShape tycle =new Tycle();
        IShape triangle = new Triangle();
        shapeMap(tycle);
        shapeMap(triangle);
    }

    public static void main1(String[] args) {
        //A a=new A();//error
        IShape ishape=new Rect();
        ishape.draw();
    }
}
