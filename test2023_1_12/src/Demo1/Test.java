package Demo1;

import java.util.Arrays;
import java.util.PriorityQueue;

class student{
    int score;
    String name;

    public student(int score){
        this.score=score;
    }
}
public class Test {
    public static void heapMaxTree(int[] array,int len){
        for (int i = len ; i > 0  ; i--) {
            int root=i;
            int tree=(root-1)/2;
            while(root>0){
                if(array[root]>array[tree]){
                    int t=array[tree];
                    array[tree]=array[root];
                    array[root]=t;
                    root=tree;
                    tree=(root-1)/2;
                }else {
                    break;
                }
            }

        }
    }
    public static void main (String[] args) {
        int[] array= {12,19,5,25,36,10,3,30,15,2,14,20,30,43,30};

        heapMaxTree(array,array.length-1);
        System.out.println(Arrays.toString(array));
    }
//    public static void main (String[] args) {
//        PriorityQueue<student> priorityQueue=new PriorityQueue<>((s1,s2)->s1.score-s2.score);
//        priorityQueue.offer(new student(12));
//        priorityQueue.offer(new student(13));
//        System.out.println();
//    }
//    public void pop() {
//        if(isEmpty()){
//           return ;
//        }
//        int t=elem[0];
//        elem[0]=elem[usedSize-1];
//        elem[usedSize-1]=t;
//        shiftDown(0,uszeSize-1);
//        uszeSize--;
//    }
//    public boolean isEmpty() {
//        return usedSize == 0;
//    }
}
