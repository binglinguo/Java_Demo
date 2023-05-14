package user;

import Book.BookList;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

class user1{
    private String[] username=new String[100];
    private int usersize;
    private int size;

    public user1 (){

    }
    public user1(String[] username) {
        this.username = username;
        this.size++;
    }

    public String[] getUsername() {
        return username;
    }

    public void setUsername(String[] username) {
        this.username = username;
    }

    public int getUsersize() {
        return usersize;
    }

    public void setUsersize(int usersize) {
        this.usersize = usersize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public java.lang.String toString() {
        return "user1{" +
                "username=" + Arrays.toString(username) +
                ", usersize=" + usersize +
                ", size=" + size +
                '}';
    }
}
/**
 * 整个程序的主函数
 */
public class Main {
    public static User login(){
        user1 user1=new user1();
        System.out.println("请输入你的姓名");
        Scanner scanner=new Scanner(System.in);
        java.lang.String name=scanner.nextLine();
        System.out.println("请输入你的身份 1--》管理员 0--》普通用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return new AdminUser(name);
        }else if(choice==0) {
            return new NormalUser(name);
        }
        else {
            System.out.println("输入错误，退出系统");
            return null;
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();//发生了向上转型
        while(true){
        int choice=user.menu();//发生了动态绑定 多态
        //根据choice调用合适的操作
        user.dowork(choice,bookList);
    }
    }
}
