package dome3;

import com.sun.org.glassfish.gmbal.ManagedObject;

interface A{
    void funA();
}

interface B extends A{
    void funB();
}

class C implements B{
    @Override
    public void funA(){
        System.out.println("123");
    }

    @Override
    public void funB(){
        System.out.println("456");
    }
}

public interface test {
    public static void main(String[] args) {
        C c=new C();
        c.funA();
        c.funB();
    }
}
