package IO;

import java.io.File;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-28 23:51
 **/
public class IODemo3 {
    public static void main (String[] args) {
        File file = new File("./aaa/bbb/ccc");
        //file.mkdir();
        //如果要创建多级目录 那么使用mkdir会创建失败 要使用mkdirs
        file.mkdirs();
    }
}
