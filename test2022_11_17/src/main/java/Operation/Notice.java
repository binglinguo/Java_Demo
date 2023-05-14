package Operation;

import BoolList.BookList;

import java.util.Scanner;

public class Notice implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("*****************************");
        System.out.println("图书馆通知栏：");
        System.out.println("热烈祝贺二十大的召开!");
        System.out.println("国家图书馆第十八届文津图书奖正式启动");
        System.out.println("本图书馆开放时间为9.00-24.00");
        System.out.println("*****************************");
//        System.out.println("敲回车进行返回主菜单");
//        Scanner scanner=new Scanner(System.in);
        //scanner.nextInt();
        //String ch=scanner.next();
    }
}
