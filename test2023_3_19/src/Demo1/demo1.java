package Demo1;
import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 20:01
 **/
public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            StringBuilder str = new StringBuilder();
            Set<Character> set = new HashSet<>();
            for (int i = 0 ; i < str2.length() ; i++) {
                set.add(str2.charAt(i));
            }
            for (int i = 0 ; i < str1.length() ; i++) {
                char ch = str1.charAt(i);
                if (set.contains(ch)) {
                    str.append(ch);
                }
            }
            System.out.println(str);
        }
    }
        public static int fun(int[] array,int index){
            if(array[index] <= array[index + 1] && array[index] >= array[index + 2]||
                    array[index] >= array[index + 1] && array[index] <= array[index + 2]){
                return array[index];
            }else if(array[index + 1] <= array[index] && array[index +1] >= array[index +2] ||
                    array[index + 1] >= array[index] && array[index +1] <= array[index +2]){
                return array[index + 1];
            }else {
                return array[index + 2];
            }
        }
        public static void main1(String[] args){
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                int n = scanner.nextInt();
                long[] array = new long[3*n];
                for(int i = 0 ;i < 3*n; i++){
                    array[i] = scanner.nextInt();
                }
                Arrays.sort(array);
                long nums = 0;
                for(int i = 0 ; i < n ; i++){
                    nums += array[array.length - (2*(i+1))];
                }
                System.out.println(nums);
            }
        }
}
