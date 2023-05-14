package User;

import java.util.Scanner;

public class OrdinaryUser extends User{

    @Override
    public int mune() {
        System.out.println("******************");
        System.out.println("请输入你的操作");
        System.out.println("******************");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的选择");
        int input=scanner.nextInt();
        return input;
    }
}
