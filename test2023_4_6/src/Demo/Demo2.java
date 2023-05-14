package Demo;

import java.util.Scanner;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-06 21:04
 **/
//扑克牌大小
public class Demo2 {
    public static int get(String s){
        String str = "345678910JQKA2jokerJoker";
        return  str.indexOf(s);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] left = null;
        String[] right = null;
        if(s.contains("joker JOKER")){
            System.out.println("joker JOKER");
        }else {
            //拆分
            String[] list = s.split("-");
            left = list[0].split(" ");
            right = list[1].split(" ");
            //判断是否有炸弹的出现
            if(left.length == 4 && right.length != 4){
                System.out.println(list[0]);
            }else if(left.length != 4 && right.length == 4){
                System.out.println(list[1]);
            }else if(left.length == right.length){
                if(get(left[0]) > get(right[0])){
                    System.out.println(list[0]);
                }else {
                    System.out.println(list[1]);
                }
            }else {
                System.out.println("ERROR");
            }
        }
    }
}
