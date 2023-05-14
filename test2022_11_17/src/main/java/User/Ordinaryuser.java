package User;

import Operation.*;

import java.util.Scanner;

public class Ordinaryuser extends User {


        public Ordinaryuser(String name){
            super(name);
            this.iOperations=new IOperation[]{
                    new ExitOperation(),
                    new FindType(),
                    new BorrowOperation(),
                    new RetOperation(),
                    new Notice(),
                    new DisOperation()
            };
        }

    @Override
    public int mune() {
        System.out.println("=======用户菜单=======");
        System.out.println("hello 尊敬用户："+this.name+" 欢迎来到冰激凌图书馆");
        System.out.println("1.查找图书(类型)（新）");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.查看通知（新）");
        System.out.println("5.查看书架（新）");
        System.out.println("0.退出登录");
        System.out.println("====================");
        System.out.println("请输入您的操作：");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }


}
