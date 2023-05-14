package Demo3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arr=new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
