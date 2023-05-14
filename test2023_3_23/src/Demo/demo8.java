package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 23:49
 **/
//反转单词序列
public class demo8 {
    public void reverse(char[] array, int start, int end) {
        if (array == null || array.length == 0) {
            return ;
        }
        while (start < end) {
            char t = array[start];
            array[start] = array[end];
            array[end] = t;
            start++;
            end--;
        }
    }
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] array = str.toCharArray();
        int i = 0;
        int j = i;
        while( i < array.length){
            while(i < array.length && array[i] != ' '){
                i++;
            }
            reverse(array,j,i - 1);
            while(i < array.length && array[i] == ' '){
                i++;
            }
            j = i;
        }
        reverse(array,j,i - 1);
        reverse(array, 0, array.length - 1);
        return new String(array);
    }
}
