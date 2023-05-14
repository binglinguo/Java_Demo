package Main;

class posswordException extends RuntimeException{
    public posswordException() {
        super("账户错误，您输入的账户不存在");
    }
    public posswordException(String message) {
        super("账户错误，您输入的账户不存在");
    }
}
public class sqluser {
    public String[] na=new String[50];
    public int naSize=50;
    public int size=0;

    public sqluser() {
        na[0]="冰激凌";
        na[1]="123";
        na[2]="宝贝";
        this.size=3;
    }
    //添加一个账户
    public void addsqluser(String name){

        if(size>naSize){
            System.out.println("内存已满！");
            return;
        }
        this.na[size]=name;
        this.size++;
    }

    public void  Seach(String name){
        for (int i = 0; i <this.size ; i++) {
            if(name.equals(na[i])){
                return ;
            }
        }
        throw new posswordException();
    }

}
