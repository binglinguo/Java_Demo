package Operation;

import BoolList.Book;
import BoolList.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("新增图书");
        System.out.println("请输入图书的名字");
        Scanner scanner=new Scanner(System.in);
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
