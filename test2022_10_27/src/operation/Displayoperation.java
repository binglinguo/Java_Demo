package operation;

import Book.Book;
import Book.BookList;

import java.util.Arrays;

/**
 *打印图书
 */
public class Displayoperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("打印图书");
//        for (BookList x:booklist) {
//            System.out.println(Arrays.toString(x));
//        }
        int size= booklist.getBookSize();
        for (int i = 0; i < size; i++) {
            Book book= booklist.getpos(i);
            System.out.println(book);
        }
    }
}
