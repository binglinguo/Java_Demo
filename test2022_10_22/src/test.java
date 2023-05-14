/**
 * java继承、向上转型以及向下转型
 *
 */
class Shape{
    public void func() {
        System.out.println("123");
    }
}
class Rest extends Shape{
    @Override
    public void func(){
        System.out.println("♦");
    }
}

class Flower extends Shape{
    @Override
    public void func(){
        System.out.println("△");
    }
}

class Pentagram extends Shape{
    @Override
    public void func(){
        System.out.println("☆");
    }
}

public class test {

    public static void main(String args[]){
        Rest rest=new Rest();
        Flower flower=new Flower();
        Pentagram pentagram=new Pentagram();

        Shape[] shapes={pentagram,rest,pentagram,rest,flower};
        for (Shape s:shapes) {
            s.func();
        }
    }

    public static void main2(String args[]){
        Rest rest=new Rest();
        Flower flower=new Flower();
        Pentagram pentagram=new Pentagram();

        String[] shapes = {"pentagram", "rest", "pentagram", "rest", "flower"};

        for (String s:shapes) {
            if(s.equals("pentagram")){
                pentagram.func();
            }
            else if(s.equals("rest")){
                rest.func();
            }
            else {
                flower.func();
            }
        }
    }

    public static void   fun(Shape shape){
        shape.func();
    }
    public static void main1(String[] args) {
        Shape shape=new Rest();
        fun(shape);
        Shape shape1=new Flower();
        fun(shape1);
        Shape pentagram=new Shape();
        fun(pentagram);
    }
}
