

public class test2022_7_27 {

    public static void main(String[] args) {
        MyarrayList myarrayList=new MyarrayList();
        for (int i = 0; i < 10; i++) {
            myarrayList.add(i,i+1);
        }
        myarrayList.display();
        myarrayList.add(10,120);//必须按照有效位置存放 否则无法放入
        System.out.println();//换行
        myarrayList.display();//测试是否能将数组进行扩容
        System.out.println("==========");
        System.out.println(myarrayList.contains(5));
        System.out.println(myarrayList.search(2));
    }


}
