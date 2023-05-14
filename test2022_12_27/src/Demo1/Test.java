package Demo1;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    /**
     * 非递归快速排序
     * @param array
     */
    public static void quicksort(int[] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(array.length-1);
        while(!stack.isEmpty()){
            int right=stack.pop();
            int left=stack.pop();
            int privo=findIndex(array,left,right);
            if(privo<right-1){
                stack.push(privo+1);
                stack.push(right);
            }
            if(privo>left+1){
                stack.push(left);
                stack.push(privo-1);
            }
        }
    }

    public static void main (String[] args) {
        int[] array={5,6,3,123,13,5165,1,56,15,163,13,56,1,56,4};
        quicksort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int findIndex(int[] array,int left,int right){
        int tmp=array[left];
        while(left<right){
            while(left<right&&array[right]>=tmp){
                right--;
            }
            array[left]=array[right];
            while(left<right && array[left]<=tmp){
                left++;
            }
            array[right]=array[left];

        }
        array[left]=tmp;
        return left;
    }
//    public static void main(String args[]) {
//        int i = -5;
//        i = ++(i++);
//        System.out.println(i);
//    }
//    public static void main(String[] args){
//        Double x=1.2;
//        long l = 1.2;
//        float f = x/l;
//        System.out.println(f);
//    }
    /**
     * 猴子吃桃问题。猴子第一天摘下若干个桃子，当时就吃了一半，还不过瘾，就又吃了一个。第二天又将剩下的
     * 桃子吃掉一半，又多吃了一个。以后每天都吃前一天剩下的一半零一个。到第 10 天在想吃的时候就剩一个桃子了,
     * 求第一天共摘下来多少个桃子
     */
    public static void main3 (String[] args) {
        int day=10;
        int peach=1;
        while(day>1){
            peach+=1;
            peach*=2;
            day--;
        }
        System.out.println(peach);

    }
    /**
     * 编程求 1~10000 之间的所有“完全数”
     * @param num
     * @return
     */
    public static void perfectNumber(int num ){
        for (int i = 1 ; i < num ; i++) {
            int count=0;
            for (int j = 1 ; j < i ; j++) {
                if(i%j==0){
                    count+=j;
                }
            }
            if(count==i){
                System.out.println(i);
            }
        }
    }

    public static void main2 (String[] args) {
        perfectNumber(10000);
    }
    public static void main1(String args[]) {
        int count=0;
        int i = 7;
        do {
            System.out.println(--i);//1
            --i;//2
            count++;
        } while (i != 0);//3
        System.out.println(count);
    }
}
