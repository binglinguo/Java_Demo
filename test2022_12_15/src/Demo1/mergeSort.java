package Demo1;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度O(N*log2^N)
 * 空间复杂度O(N)
 * 稳定性：稳定
 */
public class mergeSort {
    public static void  mergeSort(int[] array){
        int left=0;
        int right=array.length-1;
        merge(array,left,right);
    }

    public static void merge(int[] array,int left,int right){
        if(left>=right){
            return ;
        }
        int mid=left+((right-left)>>>1);

        merge(array,left,mid);
        merge(array,mid+1,right);

        mergeFunc(array,left,mid,right);
    }
    private static void mergeFunc(int[] array,int head,int mid,int last){
        int[] tmp=new int[last-head+1];
        int k=0;
        int r=head;
        int j=mid+1;
        while(head<=mid&&j<=last){
            if(array[head]<array[j]){
                tmp[k++]=array[head++];
            }else {
                tmp[k++]=array[j++];
            }
        }
        while(head<=mid){
            tmp[k++]=array[head++];
        }
        while(j<=last){
            tmp[k++]=array[j++];
        }

        for (int i = 0; i < k; i++) {
            array[i+r]=tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] array={56,1563,13,13,165,156,32,156,156,132,12};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}

