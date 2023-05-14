package Operation;

import BoolList.BookList;

import java.util.Scanner;

public class FindType implements IOperation{
    @Override
    public void work(BookList booklist) {
        System.out.println("查询图书(类型查找)");
        System.out.println("请输入你要查找的类型  例如：小说");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int flg=0;
        System.out.println("查找信息如下：");
        for (int i = 0; i <booklist.getBookSize() ; i++) {
            if(name.equals(booklist.getBooks(i).getType())){
                flg++;
                System.out.println(booklist.getBooks(i));
            }
        }
        if(flg==0){
            System.out.println("暂无该类型的书！！！");
        }
    }
}
