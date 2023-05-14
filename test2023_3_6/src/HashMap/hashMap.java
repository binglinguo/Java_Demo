package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: guo bing lin
 * @Date: 2023-03-06 19:16
 **/
public class hashMap {
    public static void main (String[] args) {
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        Map map3 = new HashMap();
        Map map4 = new HashMap();

    }
//    static final int tableSizeFor(int cap) {//cap = 10
//        int n = cap - 1;// 9 00000000 00000000 00000000 00001001
//        n |= n >>> 1;
//        //n>>>1 00000000 00000000 00000000 00001100
//        //n     00000000 00000000 00000000 00001001
//        //|=    00000000 00000000 00000000 00001101
//        //我们现在看还不是很明显  我们再做一个
//        n |= n >>> 2;
//        // n    00000000 00000000 00000000 00001101
//        //n>>>2 00000000 00000000 00000000 00001111
//        //n     00000000 00000000 00000000 00001111
//        //发现了什么吗？我们可以观察到 其实每次做 都是在复制当前前几位1
//        //当这个操作都做完之后 我们可以得到我们会变成什么样子
//        //也就是 当前的最前一位的1 后面都变为了1 如此操作我们便可以做到完成
//        //找到2的最小次幂 那么为什么要使用位运算呢？这个问题我们就不讨论了
//        //计算时cup做位运算效率很高 并且哈希表是本身就是为了快
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
//    }
}
