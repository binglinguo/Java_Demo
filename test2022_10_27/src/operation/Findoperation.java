package operation;

import Book.Book;
import Book.BookList;

/**
 *查找图书
 */
public class Findoperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("查找图书");
        System.out.println("请输入你要查找的书名");
        String name=scanner.nextLine();
        int size=booklist.getBookSize();
        for (int i = 0; i < size; i++) {
            Book book= booklist.getpos(i);
            if(name.equals(book.getName())){
                System.out.println("找到了你要查找的书 信息如下");
                System.out.println(book);
                return ;
            }
        }
        System.out.println("没有找到你要查找的书");
    }
}
