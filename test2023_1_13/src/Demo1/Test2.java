package Demo1;

public class Test2 {
    // 插入排序
    public static void insertSort(int[] array){
        // write code  here
        for (int i = 1 ; i < array.length ; i++) {
            int t=array[i];
            int j=i-1;
            for ( ;j>=0 ;j--){
                if(array[j]>t){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=t;
        } 
    }


        // 希尔排序
    public static void shellSort(int[] array){
        // write code  here
        for (int gap = array.length/2-1 ; gap > 1  ; gap=gap/2-1) {
            for (int i = gap ; i < array.length ; i++) {
                int t=array[i];
                int j=i-gap;
                for (; j>=0;j-=gap){
                    if(array[j]>t){
                        array[j+gap]=array[j];
                    }else {
                        break;
                    }
                }
                array[j+gap]=t;
            }
            insertSort(array);
        }
    }
    // 选择排序
    public static void selectSort(int[] array){
        // write code  here
        for (int i = 0 ; i < array.length ; i++) {
            int min=i;
            for (int j = i + 1 ; j < array.length ; j++) {
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(min!=i){
                int t=array[i];
                array[i]=array[min];
                array[min]=t;
            }
        }
    }


// 堆排序
    public static void heapSort(int[] array){
        // write code  here
        int len=array.length-1;
        shiftMaxHeap(array,len);
        while(len>0){
            int t=array[0];
            array[0]=array[len];
            array[len]=t;
            shiftDown(array,0,len);
            len--;
        }
    }

    public static void shiftMaxHeap(int[] array,int len){
        for (int i = (len-1)/2 ; i >= 0  ; i--) {
            shiftDown(array,i,len);
        }
    }
    private static void shiftDown(int[]  array,int root,int len) {
        int maxIndex=root*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len &&array[maxIndex]<array[maxIndex+1]){
                maxIndex++;
            }
            if(array[root]<array[maxIndex]){
                int t=array[root];
                array[root]=array[maxIndex];
                array[maxIndex]=t;

                root=maxIndex;
                maxIndex=root*2+1;
            }else {
                break;
            }
        }
    }
}
