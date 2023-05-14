package User;




import Operation.*;

import java.util.Scanner;

public class Administratoruser extends User{

    public Administratoruser(String name) {
        super(name);
        this.iOperations= new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new FindType(),
                new AddOperation(),
                new DelOperation(),
                new DisOperation(),
                new Finishing()
        };
    }



    @Override
    public int mune() {
        System.out.println("hello 尊敬的管理员："+this.name+" 欢迎来到冰激凌图书馆");
        System.out.println("======================");
        System.out.println("1.查阅图书");
        System.out.println("2.类型查找（新）");
        System.out.println("3.增加图书");
        System.out.println("4.删除图书");
        System.out.println("5.显示图书");
        System.out.println("6.整理图书（新）");
        System.out.println("0.退出登录");
        System.out.println("======================");
        System.out.println("请输入您的操作");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        return input;
    }
}
