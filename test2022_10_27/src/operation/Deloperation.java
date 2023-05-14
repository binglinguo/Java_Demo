package operation;

import Book.Book;
import Book.BookList;

/**
 *删除图书
 */
public class Deloperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("删除图书");
        System.out.println("请输入要删除的图书的名字");
        scanner.nextLine();
        String name=scanner.nextLine();
        int size= booklist.getBookSize();
        for (int i = 0; i < size; i++) {
            Book book= booklist.getpos(i);
            if(name.equals(book.getName())){
                while(i<size-1){
                    Book tmp=booklist.getpos(i+1);
                    booklist.setBooks(i,tmp);
                    i++;
                }
                booklist.setBooks(size,null);
                booklist.setBookSize(size-1);
                System.out.println("删除成功");
                return ;
            }
        }
        System.out.println("没有找到你要删除的图书");
    }
}
