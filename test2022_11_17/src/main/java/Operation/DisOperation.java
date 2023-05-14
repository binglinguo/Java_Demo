package Operation;

import BoolList.Book;
import BoolList.BookList;

public class DisOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("打印图书");
        int ret= booklist.getBookSize();
        for (int i = 0; i <ret ; i++) {
            System.out.println(booklist.getBooks(i));
        }
    }
}
