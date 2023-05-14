package Demo2;

public class ArraysListException extends RuntimeException{
    public ArraysListException(){
        super("下标不合法！");
    }
    public ArraysListException(String str){
        super("下标不合法！");
    }
}
