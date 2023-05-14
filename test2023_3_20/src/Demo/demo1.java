package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-20 09:58
 **/
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
// 如果是则返回 true ,否则返回 false 。假设输入的数组的任意两个数字都互不相同。
public class demo1 {
    public boolean VerifySquence(int[] array,int start,int end){
        if(start >= end){
            return true;
        }
        int root = array[end];
        int i = start;
        while(array[i] < root){
            i++;
        }
        for(int j = i; j <= end; j++){
            if(array[j] < root){
                return false;
            }
        }
        return VerifySquence(array,start,i-1) &&
                VerifySquence(array,i,end-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return  VerifySquence(sequence, 0, sequence.length - 1);
    }
}
