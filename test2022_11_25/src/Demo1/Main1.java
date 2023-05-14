package Demo1;

public class Main1 {
    /**
     * 排序
     * @param data
     */
    public static void shell(int[] data){
        int i;//扫描次数
        int j;//j来定位比较的元素
        int k=1;//打印计数
        int tmp;//暂存
        int jmp=data.length/2;//间距位
        while(jmp!=0){
            for (i=jmp;i<data.length;i++){
                tmp=data[i];
                j=i-jmp;
                while(j>=0&&tmp<data[j]){
                    data[j+jmp]=data[j];
                    j=j-jmp;
                }
                data[jmp+j]=tmp;
            }
            jmp=jmp/2;
        }

    }
    /**
     * 打印数组中内容
     * @param data
     */
    public static void printData(int[] data){
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] data=new int[]{63,92,27,26,45,71,58,7};
        System.out.println("排序前");
        printData(data);
        shell(data);
        System.out.println("排序后");
        printData(data);
    }
}
