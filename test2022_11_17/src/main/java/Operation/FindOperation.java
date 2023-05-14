package Operation;

import BoolList.Book;
import BoolList.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("查询图书");
        System.out.println("请输入你要查找的书名  例如：三国演义");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i = 0; i <booklist.getBookSize() ; i++) {
            if(name.equals(booklist.getBooks(i).getName())){
                System.out.println("找到了你要查找的书，信息如下：");
                System.out.println(booklist.getBooks(i));
                return ;
            }
        }
        System.out.println("未找到你要查找的书！！！");
    }

}
