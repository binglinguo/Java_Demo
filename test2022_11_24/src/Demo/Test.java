package Demo;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret=new LinkedList<>();
        boolean[] a=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            a[nums[i]-1]=true;
        }
        for(int i=0;i<nums.length;i++){
            if(!a[i]){
                ret.add(i+1);
            }
        }
        return ret;
    }
    public static int[][] get2Array(int n){
        int[][] array = new int[n][];
        for(int i = 0; i < n; i++) {
            array[i] = new int[n-i];
            n--;
        }

        return array;
    }
    void fun(int n) {
        int i=1;
        while(i<=n)
            i=i*2;
        for(int k=0;k<n;k++)
            for(int j=0;j<n;j++){

            }
               // a[i][j]=i*j;
    }

    public static void main(String[] args) {

    }
}
