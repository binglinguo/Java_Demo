package operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * 添加图书
 */
public class Addoperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("添加图书");
//        Book book=new Book("Java","炳麟",88,"学习");
//        booklist[BookSize]=book;
//        BookSize++;
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入图书的类别");
        String type=scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price=scanner.nextInt();
        Book book=new Book(name,author,price,type);
        int size=booklist.getBookSize();
        booklist.setBooks(size,book);
        booklist.setBookSize(++size);
        System.out.println("新增图书成功");

    }
}
