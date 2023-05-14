package Demo1;

import java.util.Arrays;

public class Test {
/**
 * 合并两个有序数组
 */
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int i=0;
        int size=arr1.length+arr2.length;
        int[] tmp=new int[size];
        int j=0;
        int k=0;
        while(i<size&&j<arr1.length&&k<arr2.length){
            if(arr1[j]<arr2[k]){
                tmp[i++]=arr1[j++];
                /*j++;
                i++;*/
            }else {
                tmp[i++]=arr2[k++];
                /*k++;
                i++;*/
            }
        }
        while(k<arr2.length){
            tmp[i++]=arr2[k++];
            /*k++;
            i++;*/
        }
        while(j<arr1.length){
            tmp[i++]=arr1[j++];
            /*i++;
            j++;*/
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] ret=mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(ret));
    }
}
