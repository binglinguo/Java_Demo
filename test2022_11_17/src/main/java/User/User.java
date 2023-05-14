package User;


import BoolList.Book;
import BoolList.BookList;
import Operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;
    public User(String name) {
        this.name = name;
    }

    public abstract int mune();

    public void dowork(int pos, BookList book){
        iOperations[pos].work(book);
    }
}
