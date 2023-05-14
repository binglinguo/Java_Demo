package Demo1;

class X{
    Y y=new Y();//1
    public X(){//2
        System.out.print("X");
    }
}
class Y{
    public Y(){//3
        System.out.print("Y");
    }
}
public class Test extends X{
    Y y=new Y();//4
    public Test(){//5
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Test();
    }
}
