package IO;

import java.io.File;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 19:20
 **/
public class Demo3 {
    public static void main (String[] args) {
        File file = new File("./aaa/bbb/ccc");
        //file.mkdir();
        //如果要创建多级目录 那么使用mkdir会创建失败 要使用mkdirs
        file.mkdirs();
    }
}
