package Operation;

import BoolList.Book;
import BoolList.BookList;

import java.util.Scanner;

public class RetOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("归还图书");
        System.out.println("请输入你要归还的书名  例如：三国演义");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i = 0; i <booklist.getBookSize() ; i++) {
            if(name.equals(booklist.getBooks(i).getName())){
                booklist.getBooks(i).setBorrwed(false);
                System.out.println("归还成功！信息如下：");
                System.out.println(booklist.getBooks(i));
                return ;
            }
        }
        System.out.println("本图书馆没有此书，归还失败");
    }
}
