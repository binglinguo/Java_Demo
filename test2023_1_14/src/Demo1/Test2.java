package Demo1;

public class Test2 {
    // 冒泡排序
    public static void bubbleSort(int[] array){
        // write code  here
            for (int i = 0 ; i < array.length - 1 ; i++) {
                for (int j = 0 ; j < array.length - i - 1 ; j++) {
                        if(array[j]>array[j+1]){
                            int t=array[j];
                            array[j]=array[j+1];
                            array[j+1]=t;
                        }
                }
            }
    }

// 快速
    public static void quickSort(int[] array){
        // write code  here
        quicksort(array,0,array.length-1);
    }
    public static void quicksort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }
        int privo=findIndex(array,left,right);
        quicksort(array,left,privo-1);
        quicksort(array,privo+1,right);
    }
    //挖坑法
    public static int findIndex(int[] array,int left,int right){
        int t=array[left];

        while(left<right){
            while(left<right && array[right]>=t){
                right--;
            }
            array[left]=array[right];
            while(left<right && array[left]<=t){
                left++;
            }
            array[right]=array[left];
        }
        array[left]=t;
        return right;
    }
    //Hoare法
    public static int findIndexHoare(int[] array,int left,int right){
        int t=array[left];
        int i=left;
        while(left<right){
            while(left<right && array[right]>=t){
                right--;
            }
            while(left<right && array[left]<=t){
                left++;
            }
            int tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
        }
        int tmp=array[left];
        array[left]=array[i];
        array[i]=tmp;

        return right;
    }
    public static void partition3(int[] array,int left,int right){
        int tmp=array[left];

    }
    // 归并排序---递归
    public static void mergeSort(int[] array){
        // write code  here
        mergersort(array,0,array.length-1);
    }

    public static void mergersort(int[] array,int left,int right){
        if(left>=right){
            return ;
        }
        int mid=left+((right-left)>>1);
        mergersort(array,left,mid);
        mergersort(array,mid+1,right);
        merger(array,left,mid,right);
    }

    public static void merger(int[] array,int left,int mid,int right){
        int[] ret=new int[(right-mid)+(mid-left)+1];
        int k=0;
        int s1=left;
        int s2=mid+1;
        while(s1<=mid && s2<=right){
            if(array[s1]<=array[s2]){
                ret[k++]=array[s1++];
            }else {
                ret[k++]=array[s2++];
            }
        }
        while(s1<=mid){
            ret[k++]=array[s1++];
        }
        while(s2<=right){
            ret[k++]=array[s2++];
        }
        for (int i = 0 ; i < k ; i++) {
            array[i+left]=ret[i];
        }
    }

// 归并排序---非递归
    public static void mergeSortfunc(int[] array){
        // write code  here
        for (int gap = 1 ; gap < array.length ; gap+=gap) {
            for (int i = 0 ; i < array.length ; i+=gap*2) {
                int left=i;
                int mid=left+gap-1;
                if(mid>=array.length){
                    mid=array.length-1;
                }
                int right=mid+gap;
                if(right>=array.length){
                    right=array.length-1;
                }
                merger(array,left,mid,right);
            }
        }
    }

// 计数排序
    public static void countSort(int[] array){
        // write code  here
    }
}
