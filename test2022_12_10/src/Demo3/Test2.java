package Demo3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int start=scanner.nextInt();
        int end=scanner.nextInt();

        if(start>end){
            int t=start;
            start=end;
            end=t;
        }
        int count=0;
        for(int i=start;i<=end;i++){
            boolean flg=true;
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    flg=false;
                    break;
                }
            }
            if(flg&&i>2){
                count++;
            }
        }
        System.out.println(start+"到"+end+"之间有"+count+"个大于2的素数");
    }
}
