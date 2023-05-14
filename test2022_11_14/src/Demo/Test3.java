package Demo;

class GblException extends Exception{

}
public class Test3 {
    public static void main(String[] args) throws GblException{
        int i=0;
        while(i<10){
            try{
                if(i!=10){
                    throw new GblException();
                }
            }catch(GblException e){
                e.printStackTrace();
                i++;
                System.out.println("网络断开，正在重新连接第"+i+"次");
            }
        }
        System.out.println("连接成功~，本次共重新连接"+i+"次");
    }
}
