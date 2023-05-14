package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name){
        super(name);
        this.iOperations =new IOperation[]{
                new Exitoperation(),
                new Findoperation(),
                new Addoperation(),
                new Deloperation(),
                new Displayoperation()
        };
    }

    public int menu(){
        System.out.println("=======管理员菜单=======");
        System.out.println("Hai!"+this.name+" 欢迎来到图书馆");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("====================");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
