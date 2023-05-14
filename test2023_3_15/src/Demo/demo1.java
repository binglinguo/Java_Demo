package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-15 20:24
 **/
//二维数组的查找
public class demo1 {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0  ){
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while(i < array.length && j >= 0){
            if(array[i][j] == target){
                return true;
            }
            if(array[i][j] < target){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
