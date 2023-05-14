package Dome2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入盘子的数量");
        j=scanner.nextInt();
        hanoi(j,1,2,3);
    }
    public static void hanoi(int n,int pos1,int pos2,int pos3){
        if(n==1){
            System.out.print(pos1+"->"+pos3+"   ");
        } else {
            hanoi(n-1,pos1,pos3,pos2);
            System.out.print(pos1+"->"+pos3+"   ");
            hanoi((n-1),pos2,pos1,pos3);
        }
    }
}
