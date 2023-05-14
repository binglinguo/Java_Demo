package Operation;

import BoolList.Book;
import BoolList.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("退出登录");
        System.exit(0);
    }
}
