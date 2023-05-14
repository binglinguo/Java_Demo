package Sort;

public class heapsort implements Sort{
    /**
     * 堆排序
     * 时间复杂度O(n*log2^N)
     * 空间复杂度O(N)
     * 稳定性：不稳定
     * @param array
     */
    @Override
    public void sort (int[] array) {
        heapsort(array,array.length-1) ;
    }

    public static void heapsort(int[] array,int len){
        //构建大根堆
        heap(array,len);

        //开始交换 使大根堆的最后一位与根的值做交换 交换之后再进行向下调整
        while(len>0){
            int tmp=array[0];
            array[0]=array[len];
            array[len]=tmp;
            len--;
            //进行向下调整
            shirtroot(array,0,len);
        }
    }

    public static void heap(int[] array,int len){
        for(int lastroot=(len-1)/2;lastroot>=0;lastroot--){
            shirtroot(array,lastroot,len);
        }
    }

    public static void shirtroot(int[] array,int root,int len){
        //向下调整为大根堆
        int maxroot=root*2+1;//找到左子树
        while(maxroot<len){
            if(maxroot+1<len&&array[maxroot]<array[maxroot+1]){
                maxroot++;
            }
            if(array[root]<array[maxroot]){
                //如果根节点的值小于左子树或者右子树则做交换构建为大根
                int tmp=array[root];
                array[root]=array[maxroot];
                array[maxroot]=tmp;
                root=maxroot;
                maxroot=root*2+1;
            }else {
                break;
            }
        }
    }
}
