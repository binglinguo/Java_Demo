package operation;

import Book.BookList;

/**
 *退出系统
 */
public class Exitoperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
