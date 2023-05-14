package Operation;

import BoolList.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("借阅图书");
        System.out.println("请输入你要借阅的书名  例如：三国演义");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int siz=booklist.getBookSize();
        for (int i = 0; i < siz; i++) {
            if(name.equals(booklist.getBooks(i).getName())){
                booklist.getBooks(i).setBorrwed(true);
                System.out.println("成功借阅 ，现在图书信息如下：");
                System.out.println(booklist.getBooks(i));
                return ;
            }
        }
        System.out.println("未找到你要查找的书！！！");
    }
}
