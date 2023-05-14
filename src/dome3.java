import java.util.Arrays;




class Person{
    public String name;
    public int avg;
    public static int arr;
    public void eat(){
        int a=10;//局部变量
        System.out.println("eat!");
    }
}
public class dome3 {
    /**
     * public:共有的
     * private:私有的
     * protected:受保护的
     * 什么都不写-->包访问权限
     * 可通过关键字new ：实例化一个对象
     * @param args
     */
    public static void main12(String[] args) {
        Person person=new Person();
        person.avg++;
        person.arr++;
        System.out.println(person.avg);
        System.out.println(person.arr);
       Person person1=new Person();
       person1.avg++;
       person1.arr++;
        System.out.println(person1.avg);
        System.out.println(person1.arr);


    }

    public static void main8(String[] args) {
        //new ：实例化一个对象
        Person person=new Person();
        Person person1=new Person();
    }
    public static void main7(String[] args) {
        int[] array={1,4,2,1,4};
        int red=0;
        for (int i = 0; i <array.length ; i++) {
            red^=array[i];
        }
        System.out.println(red);
    }

    public static void scarray(int[][] array){//输出 二维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }

    public static void main5(String[] args) {//Java中二维数组的定义方法
        int[][] array={{1,2,3},{4,5,6}};
        int[][] array1=new int[][]{{1,2,3},{4,5,6}};
        int[][] array2=new int[2][3];
        scarray(array1);
    }
    public static void main6(String[] args) {
        int[] array={2,3,1,6,7};
//        maoPaos(array);
        sunXuarray(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sunXuarray(int[] array){//将偶数放在前面 奇数放在后面
        int i=0,j=array.length-1;
        int temp=0;
        while (i<j){
            if (array[j]%2==0){
                if (array[i]%2!=0){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    j--;i++;
                }
                else i++;
            }
            else j--;
        }
    }

    public static void niXuarray(int[] array){//将数组逆序
        int temp=0;
        for (int i = 0, j=array.length-1; i <j ; i++,j--) {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }

    public static void maoPaos(int[] array) {//冒泡排序
        int temp=0,n=0;
        boolean red=true;
        for (int i = 0; i <array.length-1 ; i++) {
            red=true;
            for (int j = 0; j <array.length-i-1 ; j++) {
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    red=false;
                }
            }
            if (red)break;
        }

    }

    public static void maoPao(int[] array) {//冒泡排序
        int temp=0;
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static boolean ifUP(int[] array){//判断数组内容是否为升序
        int i=0;
       while(i<array.length-1){
           if (array[i]<array[i+1])i++;
           else return false;
       }
       return true;
    }



    /**
     * 二分算法原理：
     * 先将数组进行从大到小排序
     * 再查找数组中间的数字是否等于要找到的数字下标
     * 如果大于中心就往后找
     * 如果小于中心就往前找
     * 没有找到的话返回-1下标 因为数组中没有-1下标
     * @param arry
     * @param key
     * @return
     */

    public static int arryMax1(int [] arry,int key){//二分查找==Arrays.binarySearch()
        int len=0;
        //一般[formlndex--tolndex)左开右闭的
        Arrays.binarySearch(arry,2,3,8);
        int n=arry.length-1;
        while (len<=n){
            int s=(len+n)/2;//int s=(len+n)>>>1;右移相当于除2
            if (arry[s]==key)return s;
            else if (arry[s]<key)n=s-1;
            else len=s+1;
        }
        return -1;
    }

    /**
     * 总结Arrays方法
     * toString()-->表示将数组以字符串形式输出
     * binarySearch()-->表示寻找所需要的数字下标
     * copyOf()-->表示复制数组
     * equals()-->表示判断两个数组是否相等
     * fill()-->表示填充 也可指定位置
     * sort-->表示将数组变为有序数组  （排序）
     * @param arry
     * @param key
     * @return
     */
    public static int arryMax(int[] arry,int key){//二分查找算法错误示范
        Arrays.sort(arry);
        int t=arry.length/2;
        if (key==arry[t])return t;
        else if (key>arry[t]){
            for (int i = t; i <arry.length ; i++) {
                if (key==arry[i])return i;
            }
        }
        else if (key<arry[t]){
            for (int i = t; i >=0 ; i--) {
                if (key==arry[i])return i;
            }
        }return -1;
    }

    public static void main4(String[] args) {
        int[] arry={2,5,8,9,13};
        System.out.println("下标为："+arryMax(arry,13));
    }

    public static int max(int[] arr) {//找出数组中的最大值的函数
        int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
       return max;
    }

    /**
     * 数组的拷贝方式有四种
     * 1.for循环
     * 2.Arrays.copyof
     * 3.System.arraycopy(被拷贝数组,拷贝开始的位置,拷贝数组,拷贝到哪个位置,拷贝的长度);
     *4.arr.clone();克隆  产生了这个对象的一个副本  这个方法是object的克隆方法
     * object是所有类的父类
     * 浅拷贝：以上四种都是浅拷贝
     * 深拷贝：在数组当中存储的都是简单类型  如果通过修改拷贝后的元素但是不会影响到被拷贝的元素，那么我们就叫做深拷贝
     * 引用-->地址
     */
    public static void main3(String[] args) {//第四种拷贝的方法
        int[] arr={1,2,3,4,5,6,7};
        int[] arry=arr.clone();//克隆
        System.out.println(Arrays.toString(arry));
    }

    public static void main2(String[] args) {//第三种拷贝的方法
        int[] arr={1,2,3,4,5,6,7};
        int[] arry=new int[arr.length];
        System.arraycopy(arr,0,arry,0,arr.length);
        System.out.println(Arrays.toString(arry));
    }

    public static void main1(String[] args) {//拷贝的第二种方法
        int[] arr={1,2,3,4,5,6,7};
        int[] arry=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arry));
    }

}
