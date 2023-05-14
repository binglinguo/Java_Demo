package Demo2;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main (String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s="hello";
        System.out.println(s);
        Class cls=s.getClass();
        Field valueField = cls.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value=(char[]) valueField.get(s);
        value[0]='g';
        System.out.println(s);//gello
    }
    public static void main2 (String[] args) {
        final int[] arr={1,2,3,4,5};
        arr[0]=6;
        System.out.println(Arrays.toString(arr));
        //int[] arr1={6,7,8};
        //arr=arr1;//编译器报错，final修饰的arr指向不可变
    }

    public static void main1 (String[] args) {
        String str1=new String("hello");
        String str2="hello";
        System.out.println(str1==str2);
    }
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
        }

        return -1;
    }
}
