package Demo;

import java.util.Scanner;

class MyException3 extends Exception{
    public MyException3(String age){
        super(age);
    }
}
public class Test2 {
    public static void main(String[] args) throws MyException3{
        int i=0;
        Scanner scanner=new Scanner(System.in);
    while(true){
        try{
            i=scanner.nextInt();
            if(i!=10){
                throw new MyException3("error,请重新输入");
            }else{
                System.out.println("Yes");
                break;
            }
        }catch(MyException3 e){
            e.printStackTrace();
        }
    }
    }
}
