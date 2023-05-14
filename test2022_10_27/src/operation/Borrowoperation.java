package operation;

import Book.Book;
import Book.BookList;

/**
 *借阅图书
 */
public class Borrowoperation implements IOperation {
    public void work(BookList booklist) {
        System.out.println("借阅图书");
        System.out.println("请输入你要借的书名");
        String name=scanner.nextLine();
        int size=booklist.getBookSize();
        for (int i = 0; i <size ; i++) {
             Book book=booklist.getpos(i);
            if(name.equals(book.getName())){
                book.setBorrwed(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return ;
            }
        }
        System.out.println("没有此书");
    }
}
