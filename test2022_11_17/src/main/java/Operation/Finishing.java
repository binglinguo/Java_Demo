package Operation;

import BoolList.Book;
import BoolList.BookList;

import java.util.Arrays;
import java.util.Comparator;

class A implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
       int a= o1.getType().compareTo(o2.getType());
       return a;
    }
}
public class Finishing implements IOperation{

    @Override
    public void work(BookList booklist) {
        A a=new A();
        System.out.println("整理图书（按照类型）");
        Arrays.sort(booklist.books,0,booklist.getBookSize(),a);
        System.out.println("整理完成！");
    }
}
