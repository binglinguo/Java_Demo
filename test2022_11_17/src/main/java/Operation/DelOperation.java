package Operation;

import BoolList.Book;
import BoolList.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("删除图书");
        System.out.println("请输入你要删除的书名  例如：三国演义");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i = 0; i < booklist.getBookSize();i++) {
            if(name.equals(booklist.getBooks(i).getName())){
                while(i<booklist.getBookSize()-1){
                    booklist.setBooks(i, booklist.getBooks(i+1));
                    i++;
                }
                booklist.setBooks(i,null);
                booklist.setBookSize(i);
                System.out.println("删除成功!");
                return ;
            }
        }
        System.out.println("未找到你要删除的书!");
    }
}
