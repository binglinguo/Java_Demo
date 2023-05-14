package Poker;
import java.io.*;
import java.util.*;


public class Test {
    static int top=-1;
    public static void push(int[] stack,int MAX,int val){
        if(top>=MAX-1){
            System.out.println("堆栈已满");
        }else {
            top++;
            stack[top]=val;
        }
    }

    public static int pop(int[] stack){
        if(top==-1){
            System.out.println("堆栈已空");
            return -1;//这边返回-1则为空栈 业务上的东西暂时不处理
        }else {
            top--;
            return stack[top];
        }
    }
    public static void main(String[] args) {
        int[] card=new int[52];//扑克52张牌（抛去大小王）
        int[] stack=new int[52];//堆栈
        int i,j,k=0,test;
        String ascVal=null;
        int style;
        for(i=0;i<52;i++) {
            card[i] = i;
        }
            System.out.println("洗牌中，请稍后");
            while(k<30){//洗牌
                for ( i = 0; i < 51 ; i++) {
                    for(j=i+1;j<52;j++){
                        if(((int)(Math.random()*5))==2){
                            test=card[i];//洗牌
                            card[i]=card[j];
                            card[j]=test;
                        }
                    }
                }
                k++;
            }
            i=0;
            while(i!=52){
                push(stack,52,card[i]);
                i++;
            }
        System.out.println("逆时针发牌");
        System.out.println("显示各家的牌 \n 东家\t 北家\t 西家\t 南家\t");
        System.out.println("======================================");
        while(top>=0){
            style=stack[top]/13;//因为扑克牌只有1-13 一张牌有四种花色
            switch(style){
                case 0:
                    ascVal="♣";
                    break;
                case 1:
                    ascVal="♦";
                    break;
                case 2:
                    ascVal="♥";
                    break;
                case 3:
                    ascVal="♠";
                    break;
            }
            System.out.print("["+ascVal+(stack[top]%13+1)+"]");
            System.out.print('\t');
            if(top%4==0){
                System.out.println();
            }
            top--;
        }
    }
}
