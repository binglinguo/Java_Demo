package Demo;

//受检查的异常类
class MyException extends Exception{
    public MyException(String ameage){
        super(ameage);
    }
}

class MyException2 extends Exception{
    public MyException2(String ameage){
        super(ameage);
    }
}

public class Test  {
    private static final String name="lg";
    private static final String password="123";
    public static void fun(String name,String password) throws MyException,MyException2{
            if(!Test.name.equals(name)){
                throw new MyException("用户名错误");
            }
            if(!Test.password.equals(password)){
                throw new MyException2("密码错误");
            }
    }
    public static void main(String[] args) {
        try{
            fun("lg","1232");
        }catch(MyException e){
            e.printStackTrace();
            System.out.println("用户名错误");
        }catch (MyException2 e){
            e.printStackTrace();
            System.out.println("密码错误");
        }

    }
}
