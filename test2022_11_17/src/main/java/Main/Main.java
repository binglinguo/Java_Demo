package Main;

import BoolList.Book;
import BoolList.BookList;
import User.*;

import java.util.Scanner;

class users{

}
public class Main {

    public static User func(){
        System.out.println("欢迎来到冰激凌图书馆！");
        System.out.println("请问怎么称呼您？");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        sqluser sqluser1=new sqluser();
        try{
           sqluser1.Seach(name);
        }catch(posswordException e){
           e.printStackTrace();
           System.exit(-1);
        }
        System.out.println("请问您的身份为？  1-》管理员 0-》普通用户");
        int usersize=scanner.nextInt();
        if(usersize==1){
            return new Administratoruser(name);
        }else {
            return new Ordinaryuser(name);
        }
    }

    public static void main(String[] args) {
        Needtoknow();
        BookList bookList=new BookList();
        User user=func();
        while(true){
            int count=user.mune();
            user.dowork(count,bookList);
        }
    }
    public static void Needtoknow(){
        System.out.println("**************************");
        System.out.println("        入馆需知（新）");
        System.out.println("本图书馆开放时间为9.00-24.00");
        System.out.println("**************************");

    }
}
