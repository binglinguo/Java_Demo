package operation;

import Book.Book;
import Book.BookList;

/**
 *归还图书
 */
public class Retoperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("归还图书");
        System.out.println("请输入你要归还的书名");
        String name=scanner.nextLine();
        int size=booklist.getBookSize();
        for (int i = 0; i <size ; i++) {
            Book book=booklist.getpos(i);
            if(name.equals(book.getName())){
                book.setBorrwed(false);
                System.out.println("归还成功！");
                System.out.println(book);
                return ;
            }
        }
        System.out.println("没有此书");
    }

}
