package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-30 23:30
 **/
//最近公共祖先
public class demo4 {
    public int getLCA(int a, int b) {
        // write code here
        int n = Math.max(a,b);
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = i + 1;
        }
        a--;
        b--;
        while(a != b){
            if(a < b){
                b = (b - 1) / 2;
            }else if(b < a){
                a = (a - 1) / 2;
            }
        }
        return array[a];
    }
}
