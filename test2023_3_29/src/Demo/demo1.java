package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 21:20
 **/
public class demo1 {
    public static void main (String[] args) {
        Object o = new Object(){
            @Override
            public boolean equals (Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("hel"));
    }
}
