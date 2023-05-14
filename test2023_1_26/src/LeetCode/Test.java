package LeetCode;

public class Test {
    /**
     * 递归实现数组的逆序打印
     * @param array
     * @param len
     */
    public static void printArray(int[] array,int len) {
        if(len-1<0){
            return ;
        }
        System.out.print(array[len-1]);
        printArray(array,len-1);

    }
    public static void main(String[] args) {
        int[] array = {1,3,5,7,6};
        printArray(array,array.length);
    }
}
