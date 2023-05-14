package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 23:31
 **/
//左旋转字符串
public class demo7 {
    public void reverse(char[] array,int start,int end){
        while(start < end){
            char t = array[start];
            array[start] = array[end];
            array[end] = t;
            start++;
            end--;
        }
    }
    public String LeftRotateString(String str,int n) {
        if(n == 0 || str == null || str.length() == 0){
            return str;
        }
        int count = n % str.length();
        if(count == 0){
            return str;
        }
        char[] list = str.toCharArray();
        reverse(list,0,count - 1);
        reverse(list,count,str.length() - 1);
        reverse(list,0,str.length() - 1);
        return new String(list);
    }
}
