package user;

import Book.Book;
import Book.BookList;
import com.sun.org.apache.xpath.internal.operations.String;
import operation.IOperation;

import java.util.Arrays;



public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name){
        this.name=name;
    }
    public abstract int menu();

    public void dowork(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }
}
