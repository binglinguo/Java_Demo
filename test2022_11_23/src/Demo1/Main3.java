package Demo1;

import java.util.Scanner;

class NameException extends RuntimeException{
    public NameException() {
        super("用户名输入错误！");
    }
    public NameException(String message) {
        super("用户名输入错误！");
    }
}
class posswordException extends RuntimeException{
    public posswordException() {
        super("密码输入错误！");
    }
    public posswordException(String message) {
        super("密码输入错误！");
    }
}
public class Main3 {
    //自定义异常实现登录
    public static void main(String[] args) {
        String name="冰激凌";
        String possword="010822";
        Scanner scanner=new Scanner(System.in);
    try/*(Scanner scanner=new Scanner(System.in))*/{
        System.out.println("欢迎登录！");
        System.out.println("请输入用户名");
        String myname=scanner.nextLine();
        if(!myname.equals(name)){
            throw new NameException();
        }
        System.out.println("请输入密码");
        String mypossword=scanner.nextLine();
        if(!mypossword.equals(possword)){
            throw new posswordException();
        }
        System.out.println("登录成功！");
    }catch(NameException e){
        e.printStackTrace();
    }catch(posswordException e){
        e.printStackTrace();
    }finally{
        scanner.close();
    }

    }
}
