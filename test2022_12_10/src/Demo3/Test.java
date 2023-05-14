package Demo3;

import java.util.Scanner;

//class prontException extends RuntimeException{
//    public prontException() {
//        super();
//    }
//    public prontException(String s){
//        super(s);
//    }
//}
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        try{
            int pront=in.nextInt();
            if(pront<0||pront>100){
                throw new prontException();
            }
            System.out.println(pront);
        }catch(prontException e)  {
            System.out.println("分数不合法");
        }
    }
}
