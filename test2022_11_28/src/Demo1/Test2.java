package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    //杨辉三角
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                list.get(i).add(0,1);
                //list.get(i).add(j,1);
            }
        }
        System.out.println(list);
    }
}
